package cuishihao.bawie.com.day01;


import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;




public class SearchActivity extends ViewGroup {
    public SearchActivity(Context context) {
        this(context, null);
    }

    public SearchActivity(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SearchActivity(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //测量view
        measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    //自定义流式布局
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int width = getWidth();
        int height = getHeight();
        int tw = 0;
        int th = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (tw + child.getWidth() < width) {
            } else {
                tw = 0;
                th += child.getMeasuredHeight();
            }
            child.layout(tw, th, tw + child.getMeasuredWidth(), th + child.getMeasuredHeight());
            tw += child.getMeasuredWidth();
        }

    }

    public void btn_re(View view){
        Toast.makeText(getContext(),getChildAt(1)+"1234",Toast.LENGTH_SHORT).show();
    }

}