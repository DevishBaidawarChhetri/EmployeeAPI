package np.com.devish.employeeapi.API;

import java.util.List;

import np.com.devish.employeeapi.model.EmployeeCUD;
import np.com.devish.employeeapi.model.Employee;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeAPI {
    @GET ("employees") // GET METHOD -- "employees" -> This is Route
    Call<List<Employee>> getAllEmployees();

    // Get employee on basis of EmpID
    @GET ("employee/{empID}")
    Call <Employee> getEmployeeByID(@Path("empID") int empID);

    // Register User
    @POST ("create")
    Call<Void> registerEmployee(@Body EmployeeCUD emp);

}
