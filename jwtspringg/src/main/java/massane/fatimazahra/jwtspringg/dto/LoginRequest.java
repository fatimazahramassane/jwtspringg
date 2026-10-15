package massane.fatimazahra.jwtspringg.dto;

public record LoginRequest(
        String email,
        String password
) {}