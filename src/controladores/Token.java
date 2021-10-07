package controladores;

public class Token {

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    private Tipos tipo;
    private String valor;

    enum Tipos {
    	CONIF ("(if)$"),
    	OPENP ("[(]$"),
    	CLOSEP ("[)]$"),
    	OPENB ("[{]$"),
    	CLOSEB ("[}]$"),
    	CONELSE ("(else)$"),
    	CONELSEIF ("(else if)$"),
    	MAYORQUE ("[>]$"),
    	MENORQUE ("[<]$"), 
    	MAYORIGUALQUE ("(>=)$"), 
    	MENORIGUALQUE ("(<=)$"), 
    	IGUALIGUAL ("(==)$"),
    	TENTERO ("(int)$"),
    	TDOUBLE ("(double)$"),
    	TFLOAT ("(float)$"),
    	TSTRING ("(String)$"),
    	TBOOLJ ("(boolean)$"),
    	TBOOLS ("(Bool)$"),
    	TVAR ("(var)$"),
    	ASIGNADOR ("[=]$"),
    	COMILLA ("[']$"),
    	DECIMAL ("[.]$"),
    	BTRUE ("(true)$"),
    	BFALSE ("(false)$"),
    	ID ("^(?!String|int|double|float|boolean|Bool|var|if|else|elseif)[a-zA-Z][a-zA-Z0-9]*$"),
    	VALOR ("[0-9]+"),
    	FINL ("[;]$");
    
        public final String patron;
        Tipos(String s) {
            this.patron = s;
        }
    }

}
