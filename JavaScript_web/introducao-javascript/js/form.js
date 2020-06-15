var botaoAdicionar = document.querySelector("#adicionar-paciente");
botaoAdicionar.addEventListener("click", function(event) {
    event.preventDefault();

    var form = document.querySelector("#form-adiciona");
    var paciente = obtemPacienteDoFormulario(form);

    //var pacienteTr = montaTr(paciente);

    var erros = validaPaciente(paciente);

    if (erros.length > 0) {
        exibeMensagensDeErro(erros);
        return;
    }

    adicionaPacienteNaTabela(paciente);

    // limpa formulario depois do clique
    form.reset();
    // limpa formulario depois de corrigido erro
    var mensagensErro = document.querySelector("#mensagens-erro");
    mensagensErro.innerHTML = "";

});

function adicionaPacienteNaTabela(paciente) {
    // adiciona paciente na tabela
    var pacienteTr = montaTr(paciente);
    var tabela = document.querySelector("#tabela-pacientes");
    tabela.appendChild(pacienteTr);
}

function exibeMensagensDeErro(erros) {
    var ul = document.querySelector("#mensagens-erro");
    ul.innerHTML = "";
    // for(var i = 0; i < erros.length; i++){
    //     var erro = erros[i];
    // }
    erros.forEach(function(erro) {
        var li = document.createElement("li");
        li.textContent = erro;
        ul.appendChild(li);
    });
}


function obtemPacienteDoFormulario(form) {
    // objeto paciente
    var paciente = {
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calculaImc(form.peso.value, form.altura.value)
    }
    return paciente;
}

function montaTr(paciente) {
    var pacienteTr = document.createElement("tr");
    pacienteTr.classList.add("paciente");

    pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
    pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
    pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
    pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
    pacienteTr.appendChild(montaTd(paciente.imc, "info-imc"));

    return pacienteTr;
}

function montaTd(dado, classe) {
    var td = document.createElement("td");
    td.textContent = dado;
    td.classList.add("classe");

    return td;
}

function validaPaciente(paciente) {

    var erros = [];
    if (paciente.nome.length == 0) erros.push("Nome não pode estar em branco.");
    if (!validaPeso(paciente.peso)) erros.push("Peso é inválido!");
    if (paciente.peso.length == 0) erros.push("Peso não pode estar em branco.");
    if (!validaAltura(paciente.altura)) erros.push("Altura é inválida!");
    if (paciente.altura.length == 0) erros.push("Altura não pode estar em branco.");
    if (paciente.gordura.length == 0) erros.push("Gordura não pode estar em branco");

    return erros;

}