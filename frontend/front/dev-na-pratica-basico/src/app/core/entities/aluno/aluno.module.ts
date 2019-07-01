import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { AlunoService } from './aluno.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'aluno',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/aluno`,
            },
        ]),
    ],
    providers: [
      AlunoService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class AlunoModule {}
