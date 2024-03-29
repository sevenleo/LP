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
  
  foo
  
}