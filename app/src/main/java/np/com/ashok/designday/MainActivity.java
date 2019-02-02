package np.com.ashok.designday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkrememberme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkrememberme = findViewById(R.id.chkRememberMe);

        chkrememberme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkrememberme.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Checked!!!", Toast.LENGTH_SHORT).show();
                }
//TO UPDATE it and PUSH TO GITHUB...

                //I have UPDATED THE COMMENT
            }
        });
    }
}
