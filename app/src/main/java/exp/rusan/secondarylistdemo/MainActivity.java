package exp.rusan.secondarylistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<SecondaryListAdapter.DataTree<String, String>> datas = new ArrayList<>();

    private List<SecondaryListAdapter.DataTree<Flight,List<Seat>>> myDatas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.addItemDecoration(new RvDividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        RecyclerAdapter adapter = new RecyclerAdapter(this);

        adapter.setData(myDatas);
        rv.setAdapter(adapter);
    }

    {
//        List<String> group = new ArrayList<>();
         //初始化数据
         List<Flight> flightList = new ArrayList<>();
         List<Seat> s1 = new ArrayList<>();
         Seat seat1  = new Seat("1200元","一等舱");
         Seat seat12 = new Seat("1200元","二等舱");
         s1.add(seat1);
         s1.add(seat12);
        Flight f1 = new Flight("北京","上海",s1);

        List<Seat> s2 = new ArrayList<>();
        Seat seat3  = new Seat("1200元","商务舱");
        Seat seat4 = new Seat("1200元","头等舱");
        s2.add(seat3);
        s2.add(seat4);
        Flight f2 = new Flight("南京","成都",s2);

        flightList.add(f1);
        flightList.add(f2);
        for (int i = 0; i < flightList.size(); i++) {

//            datas.add(new SecondaryListAdapter.DataTree<String, String>(String.valueOf(i+1),
//                      new ArrayList<String>(){
//                        {add("sub 0"); add("sub 1"); add("sub 2");}
//                     }));
            myDatas.add(new SecondaryListAdapter.DataTree<Flight,List<Seat>>(flightList.get(i),
                    flightList.get(i).getSeats()));

        }

    }
}
