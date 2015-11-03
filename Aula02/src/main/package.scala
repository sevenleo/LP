import scala.annotation.tailrec

package object main {
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
    else if (l.isEmpty) error("índice fora dos limites da lista")
    else if (i == 0) l.head
    else elem(i-1, l.tail)
    
  def tamanho[T](l: List[T]): Int =
    if (l.isEmpty) 0
    else 1 + tamanho(l.tail)
  
  def tamanhoRF[T](l: List[T]): Int = {
    @tailrec
    def loop(acum: Int, l: List[T]): Int =
      if (l.isEmpty) acum else loop(acum+1, l.tail)
    loop(0, l)  
  }
    
  def concat[T](l1: List[T], l2: List[T]): List[T] =
    if (l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else l1.head :: concat(l1.tail, l2)
  
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
}
