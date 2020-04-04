class Main {
  public static void main(String[] args) {
    int idade = 31;
    final String NOME  = "Renato Piazza";
    final String NOME2 = "Fermi";
    final double PI = 3.14;
    float flteste;
    idade = idade + 1;

    System.out.println("Idade: " + idade);
    System.out.println(" Nome: " + NOME + " " + NOME2);

    flteste = 2.4f;
    
    System.out.println(flteste);
    /* Tipos de dados
      String -> "********"
      int    -> 109
      double -> 5.42
      float  -> 23.5f
    */
    /* Operadores
      Atribuicao: '='
      Aritimeticos: + - * / %(Modulo)
      Atribuicao composto: += -= ++ -- *=, etc.
      Logicos: && || != < > <= >= ==      
    */
    // Estruturas de decisao
    if ( idade >= 18 ){
      System.out.println(NOME + " " + NOME2 + " esta habilitado");
    }else{
      System.out.println(NOME + " " + NOME2 + " nao esta habilitado");
    }
    for (int pos=0; pos <= 10; pos++){
      System.out.println("Posicao: " + pos);
    }

    /* Colecao
      List
      MAP
      Set
    */
    List<int> lista = new ArrayList<int>();
    lista.add(33);
    for (int pos=0; pos <= 10; pos++){
      lista.add(pos);
    }
    System.out.println(lista);
  }
}