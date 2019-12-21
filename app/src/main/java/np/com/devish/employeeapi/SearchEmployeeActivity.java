package np.com.devish.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchEmployeeActivity extends AppCompatActivity {

    EditText etEmployeeId;
    Button btnSearchEmployeeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_employee);

        etEmployeeId = findViewById(R.id.etEmployeeId);
        btnSearchEmployeeId = findViewById(R.id.btnEmployeeId);

        btnSearchEmployeeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Validation
            if(TextUtils.isEmpty(etEmployeeId.getText())){
                etEmployeeId.setError("Please Enter employee id");
                return;
            }
            }
        });
    }
}
