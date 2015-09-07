package cf.app.camiloceron.com.myaplicationcf;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto1;
    TextView texto2;
    TextView texto3;
    EditText ed1;
    EditText ed2;
    EditText ed3;
    ImageView img;
    Button Boton1, Boton2, Boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (TextView)findViewById(R.id.txt1);
        texto2 = (TextView)findViewById(R.id.txt2);
        texto3 = (TextView)findViewById(R.id.txt3);
        ed1 = (EditText)findViewById(R.id.edit1);
        ed2 = (EditText)findViewById(R.id.edit2);
        ed3 = (EditText) findViewById(R.id.edit3);
        img = (ImageView)findViewById(R.id.imagen);
        Boton1 = (Button)findViewById(R.id.btn1);
        Boton2 =(Button)findViewById(R.id.btn2);
        Boton3 =(Button)findViewById(R.id.btn3);

        Boton1.setOnClickListener(this);
        Boton2.setOnClickListener(this);
        Boton3.setOnClickListener(this);



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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                String dato1 = ed1.getText().toString();
                texto1.setText(dato1);
                String dato2 = ed2.getText().toString();
                texto2.setText(dato2);
                String dato3 = ed3.getText().toString();
                texto3.setText(dato3);
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(),"Yo TE AMO muchoo mas ", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}
