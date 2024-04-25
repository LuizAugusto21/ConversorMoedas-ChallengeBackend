import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import controle.ConexaoApiController;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

//        String url_str = "https://v6.exchangerate-api.com/v6/ca744abd942dce7f81b60c01/latest/USD";
//
//// Making Request
//        URL url = new URL(url_str);
//        HttpURLConnection request = (HttpURLConnection) url.openConnection();
//        request.connect();
//
//// Convert to JSON
//        JsonParser jp = new JsonParser();
//        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//        JsonObject Objetojson = root.getAsJsonObject();
//
//// Accessing object
//        String req_result = Objetojson.get("result").getAsString();
//        System.out.println(Objetojson);
////        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        ConexaoApiController api = new ConexaoApiController("https://v6.exchangerate-api.com/v6/ca744abd942dce7f81b60c01/latest/USD");
        int escolha =0;

        while (escolha != 7){
            System.out.println("""
                    *********************************************
                    Seja bem-vindo/a ao Conversor de Moeda
                    1) Dólar =>> Peso argentino
                                        
                    2) Peso argentino =>> Dólar
                                        
                    5) Dólar =>> Real brasileiro
                                        
                    4) Real brasileiro =>> Dólar
                                        
                    5) Dólar =>> Peso colombiano
                                        
                    6) Peso colombiano =>> Dólar
                                        
                    7) Sair
                                        
                    Escolha uma opção vátida:
                    *********************************************
                    """);
             escolha = input.nextInt();

             switch (escolha){
                 case 1:
                     System.out.println("Qual o valor que deseja converter? ");
                     int valor = input.nextInt();
//                     api.getJsonResponse()
             }
        }
    }
}