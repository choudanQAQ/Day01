package cuishihao.bawie.com.day01;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView sousuo;
    private EditText text;
    private ListView lv;
    private List<User> list=new ArrayList<>();
    private MyAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sousuo = (TextView) findViewById(R.id.sousuo);
        text = (EditText) findViewById(R.id.text);
        lv = (ListView) findViewById(R.id.lv);
        sousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                list.add(new User(s));

                myadapter = new MyAdapter(list, MainActivity.this);
                lv.setAdapter(myadapter);
                myadapter.notifyDataSetChanged();
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(MainActivity.this,list.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    public void btn_clear(View view){
        Toast.makeText(MainActivity.this,"内容已经删除",Toast.LENGTH_LONG).show();
        if(list==null){

        }else{
            list.clear();
            myadapter.notifyDataSetChanged();
        }

    }

}