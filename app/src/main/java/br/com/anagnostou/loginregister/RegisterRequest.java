package br.com.anagnostou.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by George on 02/07/2016.
 */
public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://www.anagnostou.com.br/phptut/register.php";
    private Map<String , String > params;

    //Constructor
    public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", password);

    }
    @Override
    public Map<String ,String> getParams(){
        return params;
    }
}

/*
register.php
<?php
    $con = mysqli_connect("localhost", "anagn015_root", "Ayolt#1967", "anagn015_appledore");
    $name = $_POST["name"];
	$age = $_POST["age"];
	$username = $_POST["username"];
    $password = $_POST["password"];

    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, age, password) VALUES (?,?,?,?)");
    mysqli_stmt_bind_param($statement, "ssis", $name ,$username, $age, $password);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = success;
    echo json_encode($response);
?>
 */