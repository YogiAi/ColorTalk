package navyblue.top.colortalk.rest.services;


import navyblue.top.colortalk.mvp.models.Moment;
import navyblue.top.colortalk.mvp.models.User;
import navyblue.top.colortalk.rest.models.ImageResponse;
import navyblue.top.colortalk.rest.models.MomentResponse;
import navyblue.top.colortalk.rest.models.UserResponse;
import retrofit.http.Field;
import retrofit.http.GET;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by CIR on 16/1/16.
 */
public interface ColorTalkService {
    @GET("moments")
    Observable<MomentResponse> getMoments();
    @GET("images")
    Observable<ImageResponse> getImages();
    @GET("users")
    Observable<UserResponse> getUsers();

    // ['name', 'email', 'password', 'is_third', 'gender', 'birthday'];
    @POST("users")
    Observable<User> createUser(@Field("name") String name, @Field("email") String email,
                                @Field("password") String password, @Field("is_third") String is_third,
                                @Field("gender") String gender, @Field("birthday") String birthday);
    // ['user_id', 'image_name', 'text']
    @POST("moments")
    Observable<Moment> createMoment(@Field("user_id") String user_id, @Field("image_name") String image_name,
                                    @Field("text") String text);

}
