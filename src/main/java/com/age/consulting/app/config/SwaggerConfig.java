package com.age.consulting.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

    private static final String API_TITLE = "Movie Dash API";
    private static final String API_VERSION = "1.0.0";
    private static final String CONTACT_NAME = "Ednaldo Luiz";
    private static final String CONTACT_EMAIL = "contatoednaldoluiz@gmail.com";
    private static final String CONTACT_URL = "https://ednaldo-luiz.vercel.app";
    private static final String LICENSE_NAME = "Licença MIT";
    private static final String LICENSE_URL = "https://github.com/EdnaldoLuiz/movie-analytics/blob/main/LICENSE";
    private static final String LOCALHOST = "http://localhost:";
    private static final String API_DESCRIPTION = "<p>Esta é uma API robusta e abrangente para consulta de filmes e gêneros, baseada na base de dados do TMDB. A API oferece uma variedade de funcionalidades, permitindo aos usuários:</p>"
    + "<ul>"
    +   "<li><strong>Consultar filmes:</strong> Os usuários podem pesquisar filmes por vários critérios, incluindo título, gênero, ano de lançamento, entre outros.</li>"
    +   "<li><strong>Consultar gêneros:</strong> A API fornece informações detalhadas sobre diferentes gêneros, incluindo a quantidade de filmes por gênero.</li>"
    +   "<li><strong>Exportar dados:</strong> Os usuários podem exportar dados de filmes para arquivos CSV ou Excel, facilitando a análise e visualização dos dados.</li>"
    +   "<li><strong>Analisar estatísticas de popularidade:</strong> A API permite aos usuários realizar análises de crescimento de popularidade por gênero. Isso pode ser útil para identificar tendências e padrões na indústria cinematográfica.</li>"
    + "</ul>"
    + "<p>A API é projetada com uma arquitetura limpa e fácil de usar. Ela fornece endpoints bem documentados e seguros, permitindo aos usuários acessar facilmente as informações de que precisam.</p>";

    private static final Map<String, String> SERVERS = new HashMap<>();

    static {
        SERVERS.put(LOCALHOST + 8080, "Servidor Local");
        SERVERS.put(LOCALHOST + 8081, "Servidor Docker");
        SERVERS.put(LOCALHOST + 8082, "Servidor Produção");
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(getComponents())
                .info(getApiInfo());
    }

    private Components getComponents() {
        return new Components();
    }

    private Info getApiInfo() {
        return new Info()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version(API_VERSION)
                .contact(getContact())
                .license(getLicense());
    }

    private Contact getContact() {
        return new Contact()
                .name(CONTACT_NAME)
                .email(CONTACT_EMAIL)
                .url(CONTACT_URL);
    }

    private List<Server> getServers() {
        List<Server> servers = new ArrayList<>();
        SERVERS.forEach((url, description) -> servers.add(new Server()
                .url(url)
                .description(description)));
        return servers;
    }

    private License getLicense() {
        return new License()
                .name(LICENSE_NAME)
                .url(LICENSE_URL);
    }
}