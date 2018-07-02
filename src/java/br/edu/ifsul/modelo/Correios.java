/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renato
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Correios implements Serializable {

    private String endereco;
    private Double valorCompra;
    private String cepOrigem;
    private String cepDestino;
    private Double valorFrete;
    private String dataEntrega;
    private String frete;
    private String peso;
    private Integer formato; // 1 CAIXA, 2 ROLO PRISMA; 3 ENVELOPE
    private String comprimento;
    private String altura;
    private String largura;
    private String diametro;
    private String maoPropria; //serviço adicional
    private String valorDeclarado; //???
    private String avisoRecebimento; // S ou N 

    public Correios() {

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Integer getFormato() {
        return formato;
    }

    public void setFormato(Integer formato) {
        this.formato = formato;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public String getMaoPropria() {
        return maoPropria;
    }

    public void setMaoPropria(String maoPropria) {
        this.maoPropria = maoPropria;
    }

    public String getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getAvisoRecebimento() {
        return avisoRecebimento;
    }

    public void setAvisoRecebimento(String avisoRecebimento) {
        this.avisoRecebimento = avisoRecebimento;
    }

   
    

}
