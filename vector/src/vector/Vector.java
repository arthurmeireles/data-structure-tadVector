package vector;

public class Vector {
    private Object meuArray[];
    private int quantidadeElementos = 0;

    public Vector(int tam) {
        this.meuArray = new Object[tam];
    }

    public Object pincaPosicao(int indice) {
        if (meuArray[indice] == null) {
            System.out.println("Posição nulla");
            return null;
        }
        return meuArray[indice];
    }
    

    // minha função insertAtRank
    public void inserir(int indice, Object objeto){
        int tamanhoArray = meuArray.length;
        if(quantElementos() == tamanhoArray-1){
            dobrarTamanho();
            tamanhoArray = tamanhoArray * 2;
            System.out.println("Array dobrado, tamanho: " + tamanhoArray);

        }
        if(indice > tamanhoArray){
            System.out.println("Posição invalida");
        }
        
        if(meuArray[indice] != null) {
            for(int i = tamanhoArray-1; i > indice ; i--){
            	meuArray[i] = meuArray[i - 1];
            }        	
        }
        meuArray[indice] = objeto;
        quantidadeElementos ++;
    }

    // minha função de remoção a chamada de removeAtRank
    public void remover(int indice){
        if(indice > meuArray.length){
            System.out.println("Posição invalida, nenhum elemento foi removido");
        }
        else{
            Object retirado = pincaPosicao(indice);
            int tamanhoArray = meuArray.length-1;
            for(int i = indice; i < tamanhoArray ; i++){
                meuArray[i] = meuArray[i+1];
                meuArray[i + 1] = null;
            }
            System.out.println("Elemento retirado" + retirado);
            quantidadeElementos--;
        }
    }


    public Object substituicao(int indice, Object objeto) {
        // vai ver se a posição solicitada é maior que o tamanho total do array
        if(indice > meuArray.length-1){
            System.out.println("Posição invalida");
            return objeto;
        }
        Object retirado = pincaPosicao(indice);
        meuArray[indice] = objeto;
        return retirado;
    }

    // Ve se ta vazia
    public boolean taVazia() {
    	if(quantidadeElementos == 0) {
    		return true;
    	}else {
            return false;
    	}
    }

    // Retorna a quantidade de elementos minha função size
    public int quantElementos() {
        return quantidadeElementos;
    }

    // Dobra o tamanho do array
    public void dobrarTamanho() {
        int novoTamanho = meuArray.length * 2;
        Object novo[] = new Object[novoTamanho];
        for (int i = 0; i < meuArray.length; i++) {
            novo[i] = meuArray[i];
        }
        meuArray = novo;
    }

    public void listar(){
        for(int i = 0 ; i < meuArray.length; i++){
            System.out.println(meuArray[i] + "\t");
        }
        System.out.println("\n");
    }

}
