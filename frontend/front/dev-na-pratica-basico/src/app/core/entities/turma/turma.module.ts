import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { TurmaService } from './turma.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'turma',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/turma`,
            },
        ]),
    ],
    providers: [
      TurmaService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class TurmaModule {}
