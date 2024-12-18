// 1. Fonction pour afficher les x premiers nombres pairs ou impairs
fun afficherNombresPairsOuImpairs(x: Int, estPair: Boolean) {
    var nombre = if (estPair) 0 else 1
    repeat(x) {
        println(nombre)
        nombre += 2
    }
}
println("X premiers nombres pairs:")
afficherNombresPairsOuImpairs(3, true)
println("X premiers nombres impairs:")
afficherNombresPairsOuImpairs(6, false)

// 2. Fonction pour afficher les x premiers nombres de la suite Fibonacci
fun afficherFibonacci(x: Int) {
    var a = 0
    var b = 1
    repeat(x) {
        println(a)
        val somme = a + b
        a = b
        b = somme
    }
}
println("X premiers nombres de la suite Fibonacci:")
afficherFibonacci(7)

// 3. Fonction pour calculer le factoriel d'un nombre x (10 par défaut)
fun calculerFactoriel(x: Int = 10): Long {
    var resultat = 1L
    for (i in 1..x) {
        resultat *= i
    }
    return resultat
}
println("Factoriel d'un nombre (par défaut 10):")
println(calculerFactoriel())

// 4. Fonction pour afficher les x premiers nombres premiers
fun afficherNombresPremiers(x: Int) {
    var count = 0
    var nombre = 2
    while (count < x) {
        if (estPremier(nombre)) {
            println(nombre)
            count++
        }
        nombre++
    }
}

fun estPremier(nombre: Int): Boolean {
    if (nombre < 2) return false
    for (i in 2..Math.sqrt(nombre.toDouble()).toInt()) {
        if (nombre % i == 0) return false
    }
    return true
}
println("X premiers nombres premiers:")
afficherNombresPremiers(5)