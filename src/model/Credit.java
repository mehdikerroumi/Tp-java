package model;


import lombok.*;
@Data @AllArgsConstructor @NoArgsConstructor
public class Credit {


    private Long Ma_id;
    private Double Ma_capitale_Emprunt;
    private Integer Ma_nombre_Mois;
    private Double Ma_taux_Mensuel;
    private String Ma_nom_Demandeur;
    private Double Ma_mensualite;

    @Override
    public String toString(){
        var creditStr = "==================================================================== \n";
            creditStr+= "=> Crédit n°                  : " +getMa_id()+ "                        \n";
            creditStr+= "=> Nom du demandeur de crédit : " + getMa_nom_Demandeur() + "           \n";
            creditStr+= "-------------------------------------------------------------------- \n";
            creditStr+= "=> Capitale Emprunté          : " + getMa_capitale_Emprunt() + "        \n";
            creditStr+= "=> Nombre de mois             : " + getMa_nombre_Mois() + "             \n";
            creditStr+= "=> Taux mensuel               : " + getMa_taux_Mensuel() + "            \n" ;
            creditStr+= "-------------------------------------------------------------------- \n";
            creditStr+= "=> Mensualité                 : "
                    + (getMa_taux_Mensuel() == 0.0 ? "NON-CALCULE":getMa_taux_Mensuel()+ " DH/mois")+"\n";
            creditStr+= "==================================================================== \n";

        return creditStr;
    }
}
