package App.Controller;

import App.DTO.EmpresaDTO;
import App.Entity.EmpresaEntity;
import App.Enum.TIPOCADASTRO;
import App.Service.EmpresaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empresa")
@Tag(name = "empresa",
        description = "Manipula informações referentes a entidade"   )
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @Operation(summary = "Lista Registros da tabela", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Ops algoo deu errado"),
    })
    @GetMapping("/ListarEmpresaFornecedor")
    public ResponseEntity<List<EmpresaEntity>> ListarEmpresaFornecedor()
    {return service.ListarEmpresaFornecedor();}

    @Operation(summary = "Lista Registros da tabela", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Ops algoo deu errado"),
    })
    @GetMapping("/ListarEmpresaPropritario")
    public ResponseEntity<List<EmpresaEntity>> ListarEmpresaPropritario()
    { return service.ListarEmpresaPropritario();}

    @Operation(summary = "Lista Registros da tabela", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Ops algoo deu errado"),
    })
    @GetMapping("/ListarEmpresaCliente")
    public ResponseEntity<List<EmpresaEntity>> ListarEmpresaCliente()
    { return service.ListarEmpresaCliente();}

    @Operation(summary = "Busca Registros da tabela", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Ops algoo deu errado"),
    })
    @GetMapping("/BuscarEmpresaPorId")
    public ResponseEntity<EmpresaDTO> BuscarEmpresaPorId(@RequestParam Long id)
    { return service.BuscarEmpresaPorId(id);}

    @Operation(summary = "Salva Registro na tabela", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Ops algoo deu errado"),
    })
    @PostMapping("/NovaEmpresa")
    public ResponseEntity<EmpresaDTO> NovaEmpresa(@RequestParam String nome,
                                                  @RequestParam String razaoSocial,
                                                  @RequestParam String cnpj,
                                                  @RequestParam String areaAtuacao,
                                                  @RequestParam String logradouro,
                                                  @RequestParam String numero,
                                                  @RequestParam String bairro,
                                                  String referencia,
                                                  @RequestParam Long cep,
                                                  @RequestParam String cidade,
                                                  @RequestParam String estado,
                                                  @RequestParam Long prefixo,
                                                  @RequestParam Long telefone,
                                                  @RequestParam String email,
                                                  @RequestParam TIPOCADASTRO tipocadastro)
    { return service.NovaEmpresa(nome, razaoSocial, cnpj, areaAtuacao, logradouro, numero, bairro, referencia, cep, cidade, estado, prefixo, telefone, email, tipocadastro);}

    @Operation(summary = "Edita Registro na tabela", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação realizada com sucesso"),
            @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Ops algoo deu errado"),
    })
    @PutMapping("/EditarEmpresa")
    public ResponseEntity<EmpresaDTO> EditarEmpresa(@RequestParam Long id,
                                                  @RequestParam String nome,
                                                  @RequestParam String razaoSocial,
                                                  @RequestParam String cnpj,
                                                  @RequestParam String areaAtuacao,
                                                  @RequestParam String logradouro,
                                                  @RequestParam String numero,
                                                  @RequestParam String bairro,
                                                  String referencia,
                                                  @RequestParam Long cep,
                                                  @RequestParam String cidade,
                                                  @RequestParam String estado,
                                                  @RequestParam Long prefixo,
                                                  @RequestParam Long telefone,
                                                  @RequestParam String email,
                                                  @RequestParam TIPOCADASTRO tipocadastro)
    { return service.EditarEmpresa(id, nome, razaoSocial, cnpj, areaAtuacao, logradouro, numero, bairro, referencia, cep, cidade, estado, prefixo, telefone, email, tipocadastro);}
}
