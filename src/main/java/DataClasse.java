public class DataClasse {

    public String validarData(int ano){

        if (ano < 1900 || ano > 2022){
            return  "Data inválida";
        }

        return  "Data válida";
    }
}
