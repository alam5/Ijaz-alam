package rest.api.endpoints;

import rest.api.payload.User;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;


// Created for perform CRUD operation;GET, POST, PUT, Delete
public class UserEndPoints {

    public static Response createUser(User payload){

        Response response
                = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)


                .when()
                .post(Routes.post_url);
        return response;

    }

    public static Response readUser(String userName){

        Response response = given()
                .pathParam("username",userName)

                .when()
                .get(Routes.get_url);
        return response;

    }

    public static Response updateUser(User payload, String userName){

        Response response =  given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParam("username",userName)


                .when()
                .put(Routes.update_url);
        return response;

    }


    public static Response deleteUser(String userName){

        Response response = given()
                .pathParam("username",userName)

                .when()
                .delete(Routes.delete_url);
        return response;

    }



}
