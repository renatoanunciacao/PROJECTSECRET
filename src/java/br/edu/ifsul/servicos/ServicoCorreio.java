/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.servicos;

import br.edu.ifsul.modelo.Correios;
import br.edu.ifsul.servicocorreios.CResultado;
import br.edu.ifsul.servicocorreios.CalcPrecoPrazoWS;
import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 *
 * @author Renato
 */
@Stateless
@Path("servico")
@ApplicationPath("servicos")
public class ServicoCorreio extends Application implements Serializable {

    private CalcPrecoPrazoWS cliente;
    private Gson gson;

    public ServicoCorreio() {
        cliente = new CalcPrecoPrazoWS();
        gson = new Gson();
    }

    @POST
    @Produces("application/json; charset=ISO-8859-1")
    @Consumes("application/json; charset=ISO-8859-1")
    public Response buscar(Correios obj) {
        CResultado res = cliente.getCalcPrecoPrazoWSSoap().calcPrecoPrazo(
                "",
                "",
                obj.getFrete(),
                obj.getCepOrigem(),
                obj.getCepDestino(),
                obj.getPeso(),
                obj.getFormato(),
                new BigDecimal(obj.getComprimento()),
                new BigDecimal(obj.getAltura()),
                new BigDecimal(obj.getLargura()),
                new BigDecimal(obj.getDiametro()),
                obj.getMaoPropria(),
                new BigDecimal(obj.getValorDeclarado()),
                obj.getAvisoRecebimento());
        if (!res.getServicos().getCServico().get(0).getMsgErro().isEmpty()) {
            String retorno = res.getServicos().getCServico().get(0).getMsgErro();
            if (retorno.equals("")) {
                return Response.status(Response.Status.CREATED).build();
            }
        } else {
            obj.setDataEntrega(res.getServicos().getCServico().get(0).getPrazoEntrega());
            obj.setValorFrete(Double.parseDouble(res.getServicos().getCServico().get(0).getValor().replace(",", ".")));

        }
        return Response.ok(gson.toJson(obj)).build();
    }

    public CalcPrecoPrazoWS getCliente() {
        return cliente;
    }

    public void setCliente(CalcPrecoPrazoWS cliente) {
        this.cliente = cliente;
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

}
