package com.dx.admindx;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DxApi {

    @POST("login")
    Call<List<CUsuario>> createPost(@Body Post post);


    @POST("Remolques2")
    Call<List<CRemolque>> getRemolque(@Body Post2 post2);


    @POST("ViajeRemolque")
    Call<List<CViaje>> getRemolque(@Body Post3 post3);


}
