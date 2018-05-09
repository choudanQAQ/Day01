package cuishihao.bawie.com.day01;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


class MyAdapter extends BaseAdapter{
    private Context context;
    private List<User> list;
    private TextView text;

    public MyAdapter(List<User> list, Context context) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        if(convertView==null){
            holder = new viewHolder();
            convertView=View.inflate(context,R.layout.main,null);
            holder.textView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else{
            holder= (viewHolder) convertView.getTag();
        }
        holder.textView.setText(list.get(position).getTitle());
        return convertView;
    }
    class viewHolder{
        TextView textView;
    }
}