package bean;
// Generated 12/12/2023 15:11:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FornecedorBbd generated by hbm2java
 */
@Entity
@Table(name="fornecedor_bbd"
    ,catalog="db_barbara_dias"
)
public class FornecedorBbd  implements java.io.Serializable {


     private int idfornecedorBbd;
     private String nomeProprietarioBbd;
     private String sobrenomeBbd;
     private String cpfBbd;
     private String rgBbd;
     private String enderecoBbd;
     private Integer ativoBbd;
     private String emailBbd;
     private String instagramBbd;
     private String telefoneFixoBbd;
     private String celularBbd;
     private String siteBbd;
     private String cnpjBbd;
     private String facebookBbd;
     private String nomeFantasiaBbd;

    public FornecedorBbd() {
    }

	
    public FornecedorBbd(int idfornecedorBbd) {
        this.idfornecedorBbd = idfornecedorBbd;
    }
    public FornecedorBbd(int idfornecedorBbd, String nomeProprietarioBbd, String sobrenomeBbd, String cpfBbd, String rgBbd, String enderecoBbd, Integer ativoBbd, String emailBbd, String instagramBbd, String telefoneFixoBbd, String celularBbd, String siteBbd, String cnpjBbd, String facebookBbd, String nomeFantasiaBbd, Set compraBbds) {
       this.idfornecedorBbd = idfornecedorBbd;
       this.nomeProprietarioBbd = nomeProprietarioBbd;
       this.sobrenomeBbd = sobrenomeBbd;
       this.cpfBbd = cpfBbd;
       this.rgBbd = rgBbd;
       this.enderecoBbd = enderecoBbd;
       this.ativoBbd = ativoBbd;
       this.emailBbd = emailBbd;
       this.instagramBbd = instagramBbd;
       this.telefoneFixoBbd = telefoneFixoBbd;
       this.celularBbd = celularBbd;
       this.siteBbd = siteBbd;
       this.cnpjBbd = cnpjBbd;
       this.facebookBbd = facebookBbd;
       this.nomeFantasiaBbd = nomeFantasiaBbd;
    }
   
     @Id 

    
    @Column(name="idfornecedor_bbd", unique=true, nullable=false)
    public int getIdfornecedorBbd() {
        return this.idfornecedorBbd;
    }
    
    public void setIdfornecedorBbd(int idfornecedorBbd) {
        this.idfornecedorBbd = idfornecedorBbd;
    }

    
    @Column(name="nome_proprietario_bbd")
    public String getNomeProprietarioBbd() {
        return this.nomeProprietarioBbd;
    }
    
    public void setNomeProprietarioBbd(String nomeProprietarioBbd) {
        this.nomeProprietarioBbd = nomeProprietarioBbd;
    }

    
    @Column(name="sobrenome_bbd")
    public String getSobrenomeBbd() {
        return this.sobrenomeBbd;
    }
    
    public void setSobrenomeBbd(String sobrenomeBbd) {
        this.sobrenomeBbd = sobrenomeBbd;
    }

    
    @Column(name="cpf_bbd")
    public String getCpfBbd() {
        return this.cpfBbd;
    }
    
    public void setCpfBbd(String cpfBbd) {
        this.cpfBbd = cpfBbd;
    }

    
    @Column(name="rg_bbd")
    public String getRgBbd() {
        return this.rgBbd;
    }
    
    public void setRgBbd(String rgBbd) {
        this.rgBbd = rgBbd;
    }

    
    @Column(name="endereco_bbd")
    public String getEnderecoBbd() {
        return this.enderecoBbd;
    }
    
    public void setEnderecoBbd(String enderecoBbd) {
        this.enderecoBbd = enderecoBbd;
    }

    
    @Column(name="ativo_bbd")
    public Integer getAtivoBbd() {
        return this.ativoBbd;
    }
    
    public void setAtivoBbd(Integer ativoBbd) {
        this.ativoBbd = ativoBbd;
    }

    
    @Column(name="email_bbd", length=500)
    public String getEmailBbd() {
        return this.emailBbd;
    }
    
    public void setEmailBbd(String emailBbd) {
        this.emailBbd = emailBbd;
    }

    
    @Column(name="instagram_bbd")
    public String getInstagramBbd() {
        return this.instagramBbd;
    }
    
    public void setInstagramBbd(String instagramBbd) {
        this.instagramBbd = instagramBbd;
    }

    
    @Column(name="telefone_fixo_bbd", length=45)
    public String getTelefoneFixoBbd() {
        return this.telefoneFixoBbd;
    }
    
    public void setTelefoneFixoBbd(String telefoneFixoBbd) {
        this.telefoneFixoBbd = telefoneFixoBbd;
    }

    
    @Column(name="celular_bbd", length=45)
    public String getCelularBbd() {
        return this.celularBbd;
    }
    
    public void setCelularBbd(String celularBbd) {
        this.celularBbd = celularBbd;
    }

    
    @Column(name="site_bbd", length=225)
    public String getSiteBbd() {
        return this.siteBbd;
    }
    
    public void setSiteBbd(String siteBbd) {
        this.siteBbd = siteBbd;
    }

    
    @Column(name="cnpj_bbd", length=225)
    public String getCnpjBbd() {
        return this.cnpjBbd;
    }
    
    public void setCnpjBbd(String cnpjBbd) {
        this.cnpjBbd = cnpjBbd;
    }

    
    @Column(name="facebook_bbd", length=225)
    public String getFacebookBbd() {
        return this.facebookBbd;
    }
    
    public void setFacebookBbd(String facebookBbd) {
        this.facebookBbd = facebookBbd;
    }

    
    @Column(name="nome_fantasia_bbd", length=225)
    public String getNomeFantasiaBbd() {
        return this.nomeFantasiaBbd;
    }
    
    public void setNomeFantasiaBbd(String nomeFantasiaBbd) {
        this.nomeFantasiaBbd = nomeFantasiaBbd;
    }

}


