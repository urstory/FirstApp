package kr.co.sunnyvale.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    public void openSubActivity(View view){
        // 새로운 창은 안드로이드 OS에게 열어달라고 부탁.
        // Intent 생성자에는 첫번째 파라미터로 Context , 두번째는 Activity class정보가 들어간다.
        // Context 는 안드로이드 OS와 소통하기 위해 필요한 객체.
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivity(intent); // Activity가 가지고 있는 메소드
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("firstapp","onCreate 호출");
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
