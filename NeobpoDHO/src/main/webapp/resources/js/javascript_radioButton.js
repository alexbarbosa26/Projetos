function habilitaCampoPis(valor) {
    if (valor == "sim") {
        document.getElementById('pis').disabled = false;
    } else {
        document.getElementById('pis').disabled = true;
    }
}
;
function habilitaCampoFilhos(valor) {
    if (valor == "sim") {
        document.getElementById('filhos').disabled = false;
    } else {
        document.getElementById('filhos').disabled = true;
    }
}
;
function habilitaCampoReservista(valor) {
    if (valor == "Masculino") {
        document.getElementById('reservista').disabled = false;
        document.getElementById('categoria').disabled = false;
    } else {
        document.getElementById('reservista').disabled = true;
        document.getElementById('categoria').disabled = true;
    }
}
;

function habilitaCampoHorario(valor) {
    if (valor == "sim") {
        document.getElementById('especificar').disabled = false;
    } else {
        document.getElementById('especificar').disabled = true;
    }
}
;

function habilitaCampoTivit(valor) {
    if (valor == "sim") {
        document.getElementById('periodoTrabTivit').disabled = false;
    } else {
        document.getElementById('periodoTrabTivit').disabled = true;
    }
}
;

function habilitaCampoProcTivit(valor) {
    if (valor == "sim") {
        document.getElementById('processoSeletivo').disabled = false;
    } else {
        document.getElementById('processoSeletivo').disabled = true;
    }
}
;

function habilitaCampoTelemark(valor) {
    if (valor == "sim") {
        document.getElementById('processoSeletivo').disabled = false;
    } else {
        document.getElementById('processoSeletivo').disabled = true;
    }
}
;
function habilitaCampoTelemark(valor) {
    if (valor == "sim") {
        document.getElementById('quantoTempo').disabled = false;
        document.getElementById('trabalhoTelemark').disabled = false;
    } else {
        document.getElementById('quantoTempo').disabled = true;
        document.getElementById('trabalhoTelemark').disabled = true;
    }
}
;

function habilitaCampoParente(valor) {
    if (valor == "sim") {
        document.getElementById('nomeParente').disabled = false;
    } else {
        document.getElementById('nomeParente').disabled = true;
    }
}
;

function habilitaCampoDeficiencia(valor) {
    if (valor == "sim") {
        document.getElementById('nomeDeficiencia').disabled = false;
    } else {
        document.getElementById('nomeDeficiencia').disabled = true;
    }
}
;

function habilitaCampoRecrutamento(valor) {
    if (valor == "Consultoria") {
        document.getElementById('consultoriaNome').type = 'text';
        document.getElementById('consultoriaNome').disabled = false;
    } else {
        document.getElementById('consultoriaNome').type = 'hidden';
        document.getElementById('consultoriaNome').disabled = true;
    }
    if (valor == "Indique Amigo") {
        document.getElementById('indiqueAmigo').type = 'text';
        document.getElementById('indiqueAmigo').disabled = false;
    } else {
        document.getElementById('indiqueAmigo').type = 'hidden';
        document.getElementById('indiqueAmigo').disabled = true;
    }
    
    if (valor == "Outros") {
        document.getElementById('outrosNomes').type = 'text';
        document.getElementById('outrosNomes').disabled = false;
    } else {
        document.getElementById('outrosNomes').type = 'hidden';
        document.getElementById('outrosNomes').disabled = true;
    }
};

function habilitaCampoQuais(valor) {
    if (valor == "Outros") {
        document.getElementById('outrosTransportes').type = 'text';
        document.getElementById('outrosTransportes').disabled = false;
    } else {
        document.getElementById('outrosTransportes').type = 'hidden';
        document.getElementById('outrosTransportes').disabled = true;
    }
};

function habilitaCampoQntConducoes(valor) {
    if (valor <= "0") {
        document.getElementById('valorConducao').disabled = true;
        document.getElementById('quaisTransportes').disabled = true;
    } else {
        document.getElementById('valorConducao').disabled = false;
        document.getElementById('quaisTransportes').disabled = false;
    }
};

function habilitaCampoIdioma(valor) {
    if (valor == "sim") {
        document.getElementById('idioma').disabled = false;
    } else {
        document.getElementById('idioma').disabled = true;
    }
};

function timedOut(valor) {
    if (valor == "") {

        document.getElementById('texto').disabled = false;
        document.getElementById('iniciar').disabled = true;
        setTimeout(function () {document.getElementById('texto').disabled = true}, 180000);

    } else {

    }
};