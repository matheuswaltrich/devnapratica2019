import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { AlunoTurmaService } from './AlunoTurma.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'alunoTurma',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/alunoTurma`,
            },
        ]),
    ],
    providers: [
      AlunoTurmaService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class AlunoTurmaModule {}
