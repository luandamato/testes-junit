public class NotasClasse {
    
    public String validarNota(int nota){

        if (nota < 0 || nota > 10){
            return  "Nota inválida";
        }

        return  "Nota válida";
    }
    
}
