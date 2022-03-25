public class IdadeClasse {
    
    public String validarIdade(int idade){

        if (idade <= 50){
            return  "renovação a cada 10 anos";
        }
        else if( idade > 50 && idade < 70){
            return "renovação a cada 5 anos";
        }

        return  "renovação a cada 3 anos";
    }
    
}
