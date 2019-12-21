package np.com.devish.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterEmployeeActivity extends AppCompatActivity {

    EditText etName, etSalary, etAge;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_employee);

        // Binding
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etSalary = findViewById(R.id.etSalary);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validation
                if(TextUtils.isEmpty(etName.getText())){
                    etName.setError("Please enter employee name");
                    return;
                }
                if (TextUtils.isEmpty(etSalary.getText())){
                    etSalary.setError("Please enter employee salary");
                    return;
                }
                if (TextUtils.isEmpty(etAge.getText())){
                    etAge.setError("Please enter employee age");
                    return;
                }
            }
        });
    }
}
