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
                        message: 'O campo nome completo é obrigatório.'
                    }, stringLength: {
                        min: 4,
                        message: 'Minimo permitido é de 4 caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'Não é permitido inserir números'
                    }
                }
            },
            cep: {
                validators: {
                    stringLength: {
                        min: 8
                    },
                    notEmpty: {
                        message: 'O campo CEP é obrigatório'
                    }
                }
            },
            numero: {
                validators: {
                    notEmpty: {
                        message: 'O campo número é obrigatório'
                    }
                }
            },
            rua: {
                validators: {
                    stringLength: {
                        min: 8
                    },
                    notEmpty: {
                        message: 'O campo rua é obrigatório'
                    }
                }
            },
            idade: {
                validators: {
                    notEmpty: {
                        message: 'O campo idade é obrigatório'
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
                        message: 'O campo estado civil é obrigatório'
                    }
                }
            },

            rg: {
                validators: {
                    notEmpty: {
                        message: 'O campo rg é obrigatório'
                    }
                }
            },
            tituloEleitor: {
                validators: {
                    notEmpty: {
                        message: 'O campo titúlo de eleitor é obrigatório'
                    }
                }
            },

            carteiraTrabalho: {
                validators: {
                    notEmpty: {
                        message: 'O campo carteira de trabalho Nº é obrigatório'
                    }
                }
            },
            pais: {
                validators: {
                    notEmpty: {
                        message: 'O campo País é obrigatório.'
                    }
                }
            },
            bairro: {
                validators: {
                    stringLength: {
                        min: 4
                    },
                    notEmpty: {
                        message: 'O campo bairro é obrigatório.'
                    }
                }
            },
            cidade: {
                validators: {
                    stringLength: {
                        min: 3
                    },
                    notEmpty: {
                        message: 'O campo cidade é obrigatório'
                    }
                }
            },
            uf: {
                validators: {
                    stringLength: {
                        min: 2
                    },
                    notEmpty: {
                        message: 'O campo Estado é obrigatório'
                    }
                }
            },
            senha: {
                validators: {
                    notEmpty: {message: 'O campo senha é obrigatório'},
                    identical: {
                        field: 'confirmaSenha',
                        message: 'A senha e sua confirmação não são as mesmas'
                    }
                }
            },
            serie: {
                validators: {
                    notEmpty: {message: 'O campo série é obrigatório'}
                }
            },

            zona: {
                validators: {
                    notEmpty: {message: 'O campo zona é obrigatório'}
                }
            },

            secao: {
                validators: {
                    notEmpty: {message: 'O campo seção é obrigatório'}
                }
            },

            orgaoEmissor: {
                validators: {
                    notEmpty: {message: 'O campo órgão emissor é obrigatório'}
                }
            },
            dataEmissaoRG: {
                validators: {
                    notEmpty: {message: 'O campo data de emissão é obrigatório'},
                    date: {
                        format: 'DD/MM/YYYY',
                        message: 'O valor nao e uma data valida'
                    }
                }
            },
            dataEmissaoCLT: {
                validators: {
                    notEmpty: {message: 'O campo data de emissão é obrigatório'},
                    date: {
                        format: 'DD/MM/YYYY',
                        message: 'O valor nao e uma data valida'
                    }
                }
            },
            estadoEmissor: {
                validators: {
                    notEmpty: {message: 'O campo estado emissor é obrigatório'}
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
                        message: 'A senha e sua confirmação não são as mesmas'
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
                        message: 'O campo senha é obrigatório'
                    },
                    emailAddress: {
                        message: 'Por favor digite um email valido'
                    }
                }
            },
            celular: {
                validators: {
                    notEmpty: {
                        message: 'O campo celular é obrigatório'
                    }
                }
            },

            nomeMae: {
                validators: {
                    notEmpty: {
                        message: 'O campo nome mãe é obrigatório'
                    }, stringLength: {
                        min: 4,
                        message: 'Minimo permitido é de 4 caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'Não é permitido inserir números'
                    }
                }
            },

            nomePai: {
                validators: {
                    notEmpty: {
                        message: 'O campo nome pai é obrigatório'
                    }, stringLength: {
                        min: 4,
                        message: 'Minimo permitido é de 4 caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'Não é permitido inserir números'
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
                        message: 'CPF Inválido',
                        callback: function (value) {
                            //retira mascara e nao numeros       
                            cpf = value.replace(/[^\d]+/g, '');
                            if (cpf == '')
                                return false;

                            if (cpf.length != 11)
                                return false;

                            // testa se os 11 digitos são iguais, que não pode.
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
                        message: 'O campo data é obrigatório'
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
                        message: 'O campo raça é obrigatório'
                    }
                }
            },
            escolherFilho: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            escolherPis: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },qntConducoes: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            valorConducao: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            tipoConducao: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            escolherHorario: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            escolherSabDom: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },escolherTivit: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            dataDe: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            dataAte: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },escolherProcTivit: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },
            processoSeletivo: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },escolherTelemark: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },quantoTempo: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },trabalhoTelemark: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },escolherParentes: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },nomeParente: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },nomeDeficiencia: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },escolherDeficiencia: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
                    }
                }
            },fonteRecrutamento: {
                validators: {
                    notEmpty: {
                        message: 'O campo é obrigatório'
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
$(document).ready(function(){	$("#periodoTrabTivit").mask("De: 99/99/9999 Até: 99/99/9999");});
$(document).ready(function(){	$("#dataEnsinoMedio").mask("99/99/9999");});
$(document).ready(function(){	$("#dataGraduacao").mask("99/99/9999");});
$(document).ready(function(){	$("#dataPosGraduacao").mask("99/99/9999");});
$(document).ready(function(){	$("#celular").mask("(99) 99999-9999");});
$(document).ready(function(){	$("#telefone").mask("(99) 9999-9999");});
$(document).ready(function(){	$("#cep").mask("99999-999");});