package main.java.com.example.ministock.data.remote.api;

import main.java.com.example.ministock.data.remote.dto.ProdutoResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class ProdutoApiService {
    @GET("produtos/{id}")
    Call<ProdutoResponse> consultarProduto(@Path("id") int id);
}
