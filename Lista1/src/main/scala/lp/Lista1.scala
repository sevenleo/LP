package lp

object Lista1 extends App {
  // escreva testes de suas funções aqui
  
  /* //teste pascal 
  println("_________________________________________________teste pascal")
  println("0 0 = 0?")
  println( pascal(0,0))
  println("1 1 = 2?")
  println( pascal(1,1))
  println("1 2 = 3?")
  println( pascal(1,2))
  println("2 2 = 6?")
  println( pascal(2,2))
  println("4 3 = 35?")
  println( pascal(4,3)) 
  
  
  //teste balanceado
    println("_________________________________________________parenteses")
  var frase = "so (um (teste) (da funcao) )"
  println (frase+"\n  _ Balanceada? "+balanceado(frase.toList) )
  frase="abre( fecha)()()()()"
  println (frase+"\n  _ Balanceada? "+balanceado(frase.toList) )
  frase="(()(()))"
  println (frase+"\n  _ Balanceada? "+balanceado(frase.toList) )
  frase="(   (    )"
  println (frase+"\n  _ Balanceada? "+balanceado(frase.toList) )
  
  //quebrar frase aos poucos
  //despedacar(frase.toList)
   
   */
  
  particao( List(1,2,4,5), 5 )
  
}
