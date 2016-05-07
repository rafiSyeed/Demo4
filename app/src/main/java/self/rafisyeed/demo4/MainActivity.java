package self.rafisyeed.demo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Button bt1;
    EditText fname,mname,lname,result;
    String str1,str2,str3;
    private final int REQUEST_CODE = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fname = (EditText) findViewById(R.id.fname);
        mname = (EditText) findViewById(R.id.mname);
        lname = (EditText) findViewById(R.id.lname);

        /*EditText fname = (EditText) findViewById(R.id.fname);
        EditText mname = (EditText) findViewById(R.id.mname);
        EditText lname = (EditText) findViewById(R.id.lname);

        String str1 = fname.getText().toString();
        String str2 = mname.getText().toString();
        String str3 = lname.getText().toString();

        Writing these codes in onCreate will crash your program because as onCreate is building the UI you are
        asking for data, onCreate will give you null and which will point to nullPointerException

         */


    }
    public void onClick(View v){

        str1 = fname.getText().toString(); // String str1 = ((EditText) findViewById(R.id.fname)).getText().toString();
        str2 = mname.getText().toString();
        str3 = lname.getText().toString();

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("key1",str1);
        intent.putExtra("key2",str2);
        intent.putExtra("key3",str3);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
            result = (EditText) findViewById(R.id.result);
            result.setText(data.getStringExtra("finalkey"));
        }
    }
}
