$(document).ready(function () {
    $('#contact_form').bootstrapValidator({
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            nomeCompleto: {
                validators: {
                    notEmpty: {
                        message: 'O campo nome completo � obrigat�rio.'
                    }, stringLength: {
                        min: 4,
                        message: 'Minimo permitido � de 4 caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'N�o � permitido inserir n�meros'
                    }
                }
            },
            cep: {
                validators: {
                    stringLength: {
                        min: 8
                    },
                    notEmpty: {
                        message: 'O campo CEP � obrigat�rio'
                    }
                }
            },
            numero: {
                validators: {
                    notEmpty: {
                        message: 'O campo n�mero � obrigat�rio'
                    }
                }
            },
            rua: {
                validators: {
                    stringLength: {
                        min: 8
                    },
                    notEmpty: {
                        message: 'O campo rua � obrigat�rio'
                    }
                }
            },
            idade: {
                validators: {
                    notEmpty: {
                        message: 'O campo idade � obrigat�rio'
                    },
                    stringLength: {
                        min: 2,
                        message: 'Idade Minima 18'
                    }
                }
            },
            estadoCivil: {
                validators: {
                    notEmpty: {
                        message: 'O campo estado civil � obrigat�rio'
                    }
                }
            },

            rg: {
                validators: {
                    notEmpty: {
                        message: 'O campo rg � obrigat�rio'
                    }
                }
            },
            tituloEleitor: {
                validators: {
                    notEmpty: {
                        message: 'O campo tit�lo de eleitor � obrigat�rio'
                    }
                }
            },

            carteiraTrabalho: {
                validators: {
                    notEmpty: {
                        message: 'O campo carteira de trabalho N� � obrigat�rio'
                    }
                }
            },
            pais: {
                validators: {
                    notEmpty: {
                        message: 'O campo Pa�s � obrigat�rio.'
                    }
                }
            },
            bairro: {
                validators: {
                    stringLength: {
                        min: 4
                    },
                    notEmpty: {
                        message: 'O campo bairro � obrigat�rio.'
                    }
                }
            },
            cidade: {
                validators: {
                    stringLength: {
                        min: 3
                    },
                    notEmpty: {
                        message: 'O campo cidade � obrigat�rio'
                    }
                }
            },
            uf: {
                validators: {
                    stringLength: {
                        min: 2
                    },
                    notEmpty: {
                        message: 'O campo Estado � obrigat�rio'
                    }
                }
            },
            senha: {
                validators: {
                    notEmpty: {message: 'O campo senha � obrigat�rio'},
                    identical: {
                        field: 'confirmaSenha',
                        message: 'A senha e sua confirma��o n�o s�o as mesmas'
                    }
                }
            },
            serie: {
                validators: {
                    notEmpty: {message: 'O campo s�rie � obrigat�rio'}
                }
            },

            zona: {
                validators: {
                    notEmpty: {message: 'O campo zona � obrigat�rio'}
                }
            },

            secao: {
                validators: {
                    notEmpty: {message: 'O campo se��o � obrigat�rio'}
                }
            },

            orgaoEmissor: {
                validators: {
                    notEmpty: {message: 'O campo �rg�o emissor � obrigat�rio'}
                }
            },
            dataEmissaoRG: {
                validators: {
                    notEmpty: {message: 'O campo data de emiss�o � obrigat�rio'},
                    date: {
                        format: 'DD/MM/YYYY',
                        message: 'O valor nao e uma data valida'
                    }
                }
            },
            dataEmissaoCLT: {
                validators: {
                    notEmpty: {message: 'O campo data de emiss�o � obrigat�rio'},
                    date: {
                        format: 'DD/MM/YYYY',
                        message: 'O valor nao e uma data valida'
                    }
                }
            },
            estadoEmissor: {
                validators: {
                    notEmpty: {message: 'O campo estado emissor � obrigat�rio'}
                }
            },
            confirmaSenha: {
                validators: {
                    stringLength: {
                        min: 6,
                        message: 'Por favor digite no minimo 6 caracteres'
                    },
                    notEmpty: {message: 'Por favor digite um E-mail'},
                    identical: {
                        field: 'senha',
                        message: 'A senha e sua confirma��o n�o s�o as mesmas'
                    }
                }
            },
            email: {
                validators: {
                    stringLength: {
                        min: 6,
                        message: 'Por favor digite no minimo 6 caracteres'
                    },
                    notEmpty: {
                        message: 'O campo senha � obrigat�rio'
                    },
                    emailAddress: {
                        message: 'Por favor digite um email valido'
                    }
                }
            },
            celular: {
                validators: {
                    notEmpty: {
                        message: 'O campo celular � obrigat�rio'
                    }
                }
            },

            nomeMae: {
                validators: {
                    notEmpty: {
                        message: 'O campo nome m�e � obrigat�rio'
                    }, stringLength: {
                        min: 4,
                        message: 'Minimo permitido � de 4 caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'N�o � permitido inserir n�meros'
                    }
                }
            },

            nomePai: {
                validators: {
                    notEmpty: {
                        message: 'O campo nome pai � obrigat�rio'
                    }, stringLength: {
                        min: 4,
                        message: 'Minimo permitido � de 4 caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'N�o � permitido inserir n�meros'
                    }
                }
            },
            telefone: {
                validators: {
                }
            },
            cpf: {
                validators: {
                    callback: {
                        message: 'CPF Inv�lido',
                        callback: function (value) {
                            //retira mascara e nao numeros       
                            cpf = value.replace(/[^\d]+/g, '');
                            if (cpf == '')
                                return false;

                            if (cpf.length != 11)
                                return false;

                            // testa se os 11 digitos s�o iguais, que n�o pode.
                            var valido = 0;
                            for (i = 1; i < 11; i++) {
                                if (cpf.charAt(0) != cpf.charAt(i))
                                    valido = 1;
                            }
                            if (valido == 0)
                                return false;

                            //  calculo primeira parte  
                            aux = 0;
                            for (i = 0; i < 9; i ++)
                                aux += parseInt(cpf.charAt(i)) * (10 - i);
                            check = 11 - (aux % 11);
                            if (check == 10 || check == 11)
                                check = 0;
                            if (check != parseInt(cpf.charAt(9)))
                                return false;

                            //calculo segunda parte  
                            aux = 0;
                            for (i = 0; i < 10; i ++)
                                aux += parseInt(cpf.charAt(i)) * (11 - i);
                            check = 11 - (aux % 11);
                            if (check == 10 || check == 11)
                                check = 0;
                            if (check != parseInt(cpf.charAt(10)))
                                return false;
                            return true;
                        }
                    }
                }
            },
            data: {
                validators: {
                    notEmpty: {
                        message: 'O campo data � obrigat�rio'
                    },
                    date: {
                        format: 'DD/MM/YYYY',
                        message: 'O valor nao e uma data valida'
                    }
                }

            },
            raca: {
                validators: {
                    notEmpty: {
                        message: 'O campo ra�a � obrigat�rio'
                    }
                }
            },
            escolherFilho: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            escolherPis: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },qntConducoes: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            valorConducao: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            tipoConducao: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            escolherHorario: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            escolherSabDom: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },escolherTivit: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            dataDe: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            dataAte: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },escolherProcTivit: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },
            processoSeletivo: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },escolherTelemark: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },quantoTempo: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },trabalhoTelemark: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },escolherParentes: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },nomeParente: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },nomeDeficiencia: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },escolherDeficiencia: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            },fonteRecrutamento: {
                validators: {
                    notEmpty: {
                        message: 'O campo � obrigat�rio'
                    }
                }
            }
            
        }
    })
            .on('success.form.bv', function (e) {
                $('#success_message').slideDown({opacity: "show"}, "slow") // Do something ...
                $('#contact_form').data('bootstrapValidator').resetForm();

                // Prevent form submission
                e.preventDefault();

                // Get the form instance
                var $form = $(e.target);

                // Get the BootstrapValidator instance
                var bv = $form.data('bootstrapValidator');

                // Use Ajax to submit form data
                $.post($form.attr('action'), $form.serialize(), function (result) {
                    console.log(result);
                }, 'json');
            });
});


$(function () {
    $("#valorConducao").maskMoney({symbol: 'R$ ',
        showSymbol: false, thousands: '.', decimal: '.', symbolStay: true});
});


$(document).ready(function(){	$("#cpf2").mask("999.999.999-99");});
$(document).ready(function(){	$("#dataNascimento").mask("99/99/9999");});
$(document).ready(function(){	$("#dataEmissaoRg").mask("99/99/9999");});
$(document).ready(function(){	$("#dataEmissaoClt").mask("99/99/9999");});
$(document).ready(function(){	$("#periodoTrabTivit").mask("De: 99/99/9999 At�: 99/99/9999");});
$(document).ready(function(){	$("#dataEnsinoMedio").mask("99/99/9999");});
$(document).ready(function(){	$("#dataGraduacao").mask("99/99/9999");});
$(document).ready(function(){	$("#dataPosGraduacao").mask("99/99/9999");});
$(document).ready(function(){	$("#celular").mask("(99) 99999-9999");});
$(document).ready(function(){	$("#telefone").mask("(99) 9999-9999");});
$(document).ready(function(){	$("#cep").mask("99999-999");});