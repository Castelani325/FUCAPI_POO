package POO.POO.src.main.java.com.example.POO.Controllers;


// 2. Importações necessárias do Spring Framework para Web:
import org.springframework.web.bind.annotation.GetMapping;   // Para mapear requisições HTTP GET.
import org.springframework.web.bind.annotation.PathVariable; // Para capturar valores da URL (path).
import org.springframework.web.bind.annotation.RequestParam; // Para capturar parâmetros de consulta (query params).
import org.springframework.web.bind.annotation.RestController; // Marca a classe como um Controller REST.


// 3. Anotação @RestController:
//    Esta anotação informa ao Spring que esta classe é um "Controller" REST.
//    Ela combina @Controller (que marca a classe como um componente Spring MVC)
//    e @ResponseBody (que indica que o valor de retorno dos métodos deve ser
//    automaticamente serializado para o corpo da resposta HTTP, geralmente em JSON ou texto).
@RestController
public class WelcomeController {

    // 4. Primeiro Endpoint: Mensagem de Boas-Vindas Simples
    //    @GetMapping("/boasvindas"): Mapeia requisições HTTP GET para a URL "/boasvindas".
    //    Quando alguém acessar http://localhost:8080/boasvindas, este método será executado.
    @GetMapping("/boasvindas")
    public String boasVindas() {
        // Este texto será retornado como a resposta HTTP.
        return "Bem-vindo à sua primeira API Spring Boot!";
    }

    // 5. Segundo Endpoint: Mensagem Personalizada com @RequestParam
    //    @GetMapping("/saudacao"): Mapeia GET para "/saudacao".
    //    @RequestParam(value = "nome", defaultValue = "Mundo"): Captura um parâmetro de consulta chamado "nome".
    //                                                      Se o parâmetro "nome" não for fornecido na URL,
    //                                                      usará "Mundo" como valor padrão.
    //    Ex: http://localhost:8080/saudacao -> "Olá, Mundo!"
    //    Ex: http://localhost:8080/saudacao?nome=Alice -> "Olá, Alice!"
    @GetMapping("/saudacao")
    public String saudacaoPersonalizada(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
        return String.format("Olá, %s!", nome);
    }

    // 6. Terceiro Endpoint: Mensagem Personalizada com @PathVariable
    //    @GetMapping("/cumprimento/{nome}"): Mapeia GET para "/cumprimento/" seguido de um valor.
    //                                     O `{nome}` na URL indica que esta parte da URL é uma variável.
    //    @PathVariable String nome: Captura o valor da URL e o injeta na variável 'nome' do método.
    //    Ex: http://localhost:8080/cumprimento/Bob -> "Com os melhores cumprimentos, Bob!"
    @GetMapping("/cumprimento/{nome}")
    public String cumprimentoViaPath(@PathVariable String nome) {
        return String.format("Com os melhores cumprimentos, %s!", nome);
    }

    // 7. Quarto Endpoint (Opcional - Retornando um Objeto JSON)
    //    Crie uma pequena classe auxiliar para representar a resposta.
    //    Spring Boot (via Jackson) converterá automaticamente este objeto para JSON.
    //    Ex: http://localhost:8080/informacao -> {"id": 1, "mensagem": "Informação da API"}
    @GetMapping("/informacao")
    public InformacaoApi getInformacao() {
        return new InformacaoApi(1, "Informação da sua API Spring Boot!");
    }

    // Classe auxiliar para o exemplo de retorno de objeto.
    // Observe que ela é uma classe interna estática para simplificar o exemplo,
    // mas em projetos reais seria uma classe separada (ex: InformacaoApi.java).
    static class InformacaoApi {
        private final long id;
        private final String mensagem;

        public InformacaoApi(long id, String mensagem) {
            this.id = id;
            this.mensagem = mensagem;
        }

        // Getters são necessários para que o Spring possa serializar para JSON.
        public long getId() {
            return id;
        }

        public String getMensagem() {
            return mensagem;
        }
    }
}
