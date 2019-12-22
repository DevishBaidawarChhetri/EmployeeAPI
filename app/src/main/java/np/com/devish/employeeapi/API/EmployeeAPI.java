package np.com.devish.employeeapi.API;

import java.util.List;

import np.com.devish.employeeapi.model.Employee;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeAPI {
    @GET ("employees") // GET METHOD -- "employees" -> This is Route
    Call<List<Employee>> getAllEmployees();
}
