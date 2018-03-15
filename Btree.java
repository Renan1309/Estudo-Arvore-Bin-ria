package Arvore_Binaria;

public class Btree {
	
	 static Node Noraiz; 

	public static void inserirNo(Node no ,int value) {
		Node novoNo = new Node(value);
		
		if(no == null) {
			Noraiz = novoNo;
			  System.out.println("Raiz "+Noraiz.value);
		}
		else {
			if(value  < no.value) {
			  if(no.esquerda != null) {
				  inserirNo(no.esquerda, value);
			  }else {
				  System.out.println("Inse "+value+"a esq "+no.value);
				  no.esquerda = new Node(value);
			  }
				
			}
			else {
				if(no.direita !=null) {
					inserirNo(no.direita , value);
					
				}else {
					System.out.println("Inse "+value+"a dir "+no.value);
					 no.direita= new Node(value);
				}
				
			}
			
			
			
		}
		
	}
	public static void inordem(Node no) {
        if(no != null){
        	inordem(no.esquerda);
		System.out.println(no.value + " ");
        	inordem(no.direita);
        }
    }
	 public static void inserir(int valor) {
	        inserirNo(Noraiz, valor);
	    }
	 
	 public static  void buscar(Node no ,int valor) {
		 if(no == null) {
			 System.out.println( "valor não encontrado ");
			}
		 else {
			 if(valor == no.value) {
				 System.out.println("Árvore :"+no.value);
			 }
			 else if(valor < no.value) {
				 buscar(no.esquerda , valor);
			 }
			 else if(valor > no.value) {
				 buscar(no.direita, valor);
			 }
		   }
		 }
	 
	 public static  void remove(Node no ,int valor) {
		 if(no == null) {
			 System.out.println( "vazio @ ");
			}
		 else {
			 if(no.esquerda == null && no.direita == null) {
				 if (no.value ==  valor) {
					 no.esquerda = null;
				 }
				 else {
					 no.direita = null;
				 }
			 }
			 else {
				 if (no.esquerda == null || no.direita !=null) {
					 no = no.esquerda.
				 }
			 }
			 
			 
		 }
		 
	 }
	
	
	
	
	public static void main(String[] args) {
		inserir(10);
		inserir(4);
		inserir(15);
		inserir(2);
		inserir(5);
		inserir(6);
		inserir(1);
		inserir(7);
		inserir(8);
		
		System.out.println("********************************");
		
	    inordem(Noraiz);
	    
	    System.out.println("********************************");
	    System.out.println("BUSCA");
	    int value = 50;
	    buscar(Noraiz,  value);
		
	}

	

}
 class Node {
	 
	 int value ;
	 
	 Node esquerda;
	 Node direita;
	 
	 Node(int value){
		 
		 this.value = value;
	 }
	 
	 
 }