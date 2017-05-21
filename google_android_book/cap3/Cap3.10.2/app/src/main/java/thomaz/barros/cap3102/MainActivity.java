package thomaz.barros.cap3102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bLogin = (Button) findViewById(R.id.bLogin);
        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText etUsername = (EditText) findViewById(R.id.etUsername);
                EditText etPassword = (EditText) findViewById(R.id.etPassword);

                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString();

                if(username.equals("thomaz")&& password.equals("123")){
                    alert("Welcome!");
                }
                else {
                    alert("Wrong credentials.");
                }

            }
        });


    }

    private void alert (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
