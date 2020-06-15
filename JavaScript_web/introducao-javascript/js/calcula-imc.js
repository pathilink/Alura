// buscar por classe
var titulo = document.querySelector(".titulo");
console.log(titulo);
console.log(titulo.textContent);

// altera texto no html
titulo.textContent = "Aparecida Nutricionista";

// seleciona paciente
var pacientes = document.querySelectorAll(".paciente");

for (var i = 0; i < pacientes.length; i++) {

    var paciente = pacientes[i];

    var tdPeso = paciente.querySelector(".info-peso");
    var peso = tdPeso.textContent;
    var tdAltura = paciente.querySelector(".info-altura");
    var altura = tdAltura.textContent;
    var tdImc = paciente.querySelector(".info-imc");

    // calcula imc
    var pesoEhValido = validaPeso(peso);
    var alturaEhValida = validaAltura(altura);

    if (!pesoEhValido) {
        console.log("Peso inválido.");
        pesoEhValido = false;
        tdImc.textContent = "Peso inválido";
        //paciente.style.backgroundColor = "lightcoral";
    }
    if (!alturaEhValida) {
        console.log("Altura inválida.");
        alturaEhValida = false;
        tdImc.textContent = "Altura inválida";
        //paciente.style.backgroundColor = "lightcoral";
    }

    if (pesoEhValido && alturaEhValida) {
        var imc = calculaImc(peso, altura);
        tdImc.textContent = imc;
    } else {
        tdImc.textContent = "Altura e/ou peso inválidos!";
        paciente.classList.add("paciente-invalido");
    }


}

function validaPeso(peso) {
    if (peso >= 0 && peso < 1000) {
        return true;
    } else {
        return false;
    }
}

function validaAltura(altura) {
    if (altura >= 0 && altura < 3.0) {
        return true;
    } else {
        return false;
    }
}

function calculaImc(peso, altura) {
    var imc = 0;
    imc = peso / (altura * altura);
    return imc.toFixed(2);
}