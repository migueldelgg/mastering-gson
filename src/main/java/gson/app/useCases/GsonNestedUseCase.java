package gson.app.useCases;

import com.google.gson.Gson;
import gson.app.domain.nested.Address;
import gson.app.domain.nested.UserNested;
import gson.app.domain.quickStart.User;

public class GsonNestedUseCase {

    public static void serializableUserNested() {
        var userAddress = Address.builder()
                .street("Avenida guarulhos")
                .houseNumber("609 - ap73B")
                .city("Guarulhos")
                .country("Brasil")
                .build();

        var userNested = UserNested.builder()
                .name("Miguel")
                .email("miguel@gmail.com")
                .age(20)
                .isDeveloper(true)
                .address(userAddress)
                .build();

        String json = new Gson().toJson(userNested);

        System.out.println(json);
    }

    public static void deserializableUserNested() {
        // Definindo um JSON representando os dados de um usuário com informações aninhadas
        String json = "{\"name\":\"Miguel\",\"email\":\"miguel@gmail.com\",\"age\":20,\"isDeveloper\":true,\"address\":{\"street\":\"Avenida Guarulhos\",\"houseNumber\":\"609 - ap73B\",\"city\":\"Guarulhos\",\"country\":\"Brasil\"}}";

        /* O objetivo aqui é desserializar o JSON para a classe `UserNested`.
        `UserNested` é a classe raiz que contém os atributos diretos do usuário
        e também um atributo `address` que representa outro objeto com informações de endereço.
        Usando a biblioteca Gson, convertemos o JSON diretamente para um objeto `UserNested`.*/

        UserNested userNested = new Gson().fromJson(json, UserNested.class);

        /* Após a desserialização, podemos acessar diretamente os atributos do objeto `UserNested`,
        incluindo o objeto `address` e seus respectivos campos, contanto que existam getters e setters na classe.*/

        var address = userNested.getAddress(); // Exemplo de acesso ao objeto aninhado

        // Exibindo as informações do objeto desserializado no console

        System.out.println(userNested.toString());

    }


}
