import com.tal.echo.core.model.dto.ProjectHookDTO;
import com.tal.echo.core.model.entity.hook.WebHook;

/**
 * @author magaofei
 */
public class ProjectWebHook {

    private ProjectHookDTO projectHookDTO;
    private WebHook webHook;

    /**
     * 保留默认构造方法
     * @param projectHookDTO
     * @param webHook
     */
    public void with(ProjectHookDTO projectHookDTO, WebHook webHook) {
        this.projectHookDTO = projectHookDTO;
        this.webHook = webHook;
    }

    public ProjectHookDTO getProjectHookDTO() {
        return projectHookDTO;
    }

    public void setProjectHookDTO(ProjectHookDTO projectHookDTO) {
        this.projectHookDTO = projectHookDTO;
    }

    public WebHook getWebHook() {
        return webHook;
    }

    public void setWebHook(WebHook webHook) {
        this.webHook = webHook;
    }

    @Override
    public String toString() {
        return "ProjectWebHook{" +
                "projectHookDTO=" + projectHookDTO +
                ", webHook=" + webHook +
                '}';
    }
}
