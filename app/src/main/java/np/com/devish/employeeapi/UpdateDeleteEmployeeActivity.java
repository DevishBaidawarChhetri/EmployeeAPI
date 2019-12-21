package np.com.devish.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateDeleteEmployeeActivity extends AppCompatActivity {
    EditText etEmployeeId, etUpdateName, etUpdateSalary, etUpdateAge;
    Button btnEmployeeIdSearch, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete_employee);

        // BInding
        etEmployeeId = findViewById(R.id.etEmployeeId);
        etUpdateName = findViewById(R.id.etUpdateName);
        etUpdateSalary = findViewById(R.id.etUpdateSalary);
        etUpdateAge = findViewById(R.id.etUpdateAge);
        btnEmployeeIdSearch = findViewById(R.id.btnEmployeeIdSearch);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);

        btnEmployeeIdSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validation for searching employee id
                if (TextUtils.isEmpty(etEmployeeId.getText())){
                    etEmployeeId.setError("Please enter employee id");
                    return;
                }
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etEmployeeId.getText())){
                    etEmployeeId.setError("Please enter employee id");
                    return;
                }
                if (TextUtils.isEmpty(etUpdateName.getText())){
                    etUpdateName.setError("Please enter employee name");
                    return;
                }
                if (TextUtils.isEmpty(etUpdateSalary.getText())){
                    etUpdateSalary.setError("Please enter employee salary");
                    return;
                }
                if (TextUtils.isEmpty(etUpdateAge.getText())){
                    etUpdateAge.setError("Please enter employee age");
                    return;
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etEmployeeId.getText())){
                    etEmployeeId.setError("Please enter employee id");
                    return;
                }
            }
        });
    }
}
