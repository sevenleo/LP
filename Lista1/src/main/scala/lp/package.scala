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
        lista=lista.tail //erro?
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

  
  
  
  
  
  
  
  //quicksort
  def quicksort(l: List[Int]): List[Int] = ???

  

  //CR
  def crSemestre(notas: List[(Double, Int)]): (Double, Int) = ???

  
  
  
  
  
  
  
  

  
  
  
  
  
  
  
  
  
  
  val foo = 42
  val bar = 2 + foo
  
  def quadrado(x: Double) = x * x
  def somaDeQuadrados(x: Double, y: Double) =
    quadrado(x) + quadrado(y)
  
  def loop: Double = loop
  def primeiro(x: Double, y: => Double) = x
  
  def abs(x: Double) = if (x >= 0) x else -x
  
  def raiz(x: Double): Double = {
    val erro = 0.0000001
    
    @tailrec
    def raizIter(est: Double, x: Double): Double =
      if (suficiente(est, x)) est else raizIter(melhora(est, x), x)

    def suficiente(est: Double, x: Double) = 
      abs(quadrado(est) - x) < erro

    def melhora(est: Double, x: Double) = (est + x / est) / 2
     
    raizIter(1.0, x)
  }
  
  val x = 0
  def f(y: Int) = y + 1  
  
  val result = {
    val x = f(3)
    x * x
  }
  
  @tailrec
  def mdc(a: Int, b: Int): Int = 
    if (b == 0) a else mdc(b, a % b)

    @tailrec
  def contador(a: Double, b: Double): Double =
    if (a == 0) a else contador(a - b, b)
  
  def fat(x: Int): Int = if (x < 2) 1 else x * fat(x - 1)

  def fatIter(x: Int) = {
    @tailrec
    def loop(acum: Int, x: Int): Int =
      if (x < 2) acum else loop(acum * x, x - 1)
    
    loop(1, x)
  }
  
  val l = List(1, 2) :: List(3) :: List(4, 5) :: Nil
  
  @tailrec
  def elem[T](i: Int, l: List[T]): T = 
    if (i < 0) error("índice não pode ser negativo")
    else l match {
      case Nil => error("índice fora dos limites da lista")
      case h :: t => if (i == 0) h else elem(i-1, t)
    }
        
  def tamanho[T](l: List[T]): Int = l match {
    case Nil => 0
    case _ :: t => 1 + tamanho(t)
  }
  
 def tamanhoRF[T](l: List[T]): Int = {
    @tailrec
    def loop(acum: Int, l: List[T]): Int = l match {
     	case Nil => acum
        case _ :: t => loop(acum+1, t)
    }
    loop(0, l)  
  }
    
  def concat[T](l1: List[T], l2: List[T]): List[T] = (l1, l2) match {
    case (Nil, l) => l
    case (l, Nil) => l
    case (h :: t, l) => h :: concat(t, l)
  }
  
  def inverte[T](l: List[T]): List[T] = {
    @tailrec
    def loop(acum: List[T], l: List[T]): List[T] =
      if (l.isEmpty) acum
      else loop(l.head :: acum, l.tail)
    loop(Nil, l)
  }
    
  def concatRF[T](l1: List[T], l2: List[T]): List[T] = {
    @tailrec
    def loop(acum: List[T], l: List[T]): List[T] =
      if (l.isEmpty) acum
      else loop(l.head :: acum, l.tail)
    
    inverte(loop(inverte(l1), l2))
  }
  
  // Zipper
  
  def zipper[T](l: List[T]): (List[T], T, List[T]) = l match {
    case Nil => error("lista vazia não tem zipper")
    case h :: t => (Nil, h, t)
  }
  
  def avance[T](z: (List[T], T, List[T])): (List[T], T, List[T]) =
    z match {
      case (_, _, Nil) => error("estou no final da lista")
      case (e, f, h :: t) => (f :: e, h, t)
    }

  def retroceda[T](z: (List[T], T, List[T])): (List[T], T, List[T]) =
    z match {
      case (Nil, _, _) => error("estou no inicio da lista")
      case (h :: t, f, d) => (t, h, f :: d)
    }
  
  // Ambientes
  
  def lookup[T](env: List[(String, T)], nome: String): T = env match {
    case Nil => error(nome + " não encontrado")
    case (n, e) :: t => if (nome == n) e else lookup(t, nome) 
  }
  
  def vazio[T]: List[(String, T)] = Nil
  
  def extend[T](env: List[(String, T)], n: String, v: T) = (n, v) :: env
  
  // Somatórios
  
  def somaInt(a: Int, b: Int): Int = if (a > b) 0 else a + somaInt(a + 1, b)


  def somaQuad(a: Int, b: Int): Int = {
    def quadrado(x: Int) = x * x
  
    if (a > b) 0 else quadrado(a) + somaQuad(a + 1, b)
  }
  
  def soma(f: Int => Int, a: Int, b: Int): Int = 
    if (a > b) 0 else f(a) + soma(f, a + 1, b)
  
  
}