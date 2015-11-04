import scala.annotation.tailrec

package object lp {
  // defina as funções da sua resposta aqui
   
  
  //triangulo de pascall
  def pascal(col: Int, lin: Int): Int = {
    val conta =0

    if(col==0) conta+1 
    else if(lin==0) conta+1
    else  conta+ pascal(col-1, lin) + pascal(col, lin-1)
  }
  
  
  
  
  //parenteses
  def balanceado(l: List[Char]): Boolean = {
    var lista = l
    var par=0
    var keep=true
    var i = lista.length
    while (i>0){
        if (lista.isEmpty || lista.head==Nil) keep=false //nao poe ser nil se for o ultimo elemento da lista que ja esta vazia?
        
        if (lista.head=='(') {
            par=par+1
        }
        
        else if (lista.head==')') {
          if (par==0) return false          
            par=par-1
        }
        lista=lista.tail 
        i=i-1
    }
    
    if(par == 0) true
    else false
  }
  
  //despedaçar: quebrar a frase até ela sumir
  def despedacar(lista: List[Char]): Boolean = {
   var i = lista.length
   var ls = lista
   while (i>0){
        println(ls)
        ls=ls.tail
        i=i-1
    }  
    true
  }
  
  /*
  
  //particao

  def particao(l: List[Int], pivo: Int): (List[Int], List[Int]) = {
    var lista = l
    var i = lista.length
    
    if (lista.head <= pivo) {
      var menores=lista.head::Nil
      var maiores=Nil::Nil
    }
    else {
      var menores=Nil::Nil
      var maiores=lista.head::Nil
    }
    lista=lista.tail
    i=i-1
    
    
    while (i>0){
      if (lista.head <= pivo) {
        menores=concat(menores,lista.head)
      }
      else {
        maiores=concat(maiores,lista.head)
      }
      lista=lista.tail
      i=i-1
    }
    println(menores,maiores)
    (menores,maiores)
  }

  
  
  */
  
  
  
  
  //quicksort
  def quicksort(l: List[Int]): List[Int] = ???

  

  //CR
  def crSemestre(notas: List[(Double, Int)]): (Double, Int) = {
    var lista = notas
    var medias: (Double, Int) =(0.00,0)
    
    lista.foreach{
        println(_)
        //tentei somar todos os creditos e todas as pontuacoes ...
        //medias._1 += _._1
        //medias._2 = medias._2 + _._2
        //OR
        //medias = medias + (_._1:Double, _._2:Int) 
         
    }
    var cr = medias._1/medias._2
    println("CR do smestre: "+medias._1+"/"+medias._2+" = "+ cr) // CR do semestre, todAs as notas divididas por todos creditos
    medias
  } 

  
  
}