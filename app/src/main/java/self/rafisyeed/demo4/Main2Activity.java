package self.rafisyeed.demo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String str1 = intent.getStringExtra("key1");
        String str2 = intent.getStringExtra("key2");
        String str3 = intent.getStringExtra("key3");
        String finalResult = str1+" "+str2+" "+str3;

        Intent intent1 = new Intent(this,MainActivity.class);
        intent1.putExtra("finalkey",finalResult);
        setResult(RESULT_OK,intent1);
        finish();

    }
}
