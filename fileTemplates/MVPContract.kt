#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end

import com.youdao.yread.lib.ui.base.BasePresenter
import com.youdao.yread.lib.ui.base.BaseView

#parse("File Header.java")
interface ${NAME} {

  interface View : BaseView
  
  interface Presenter : BasePresenter<View>
}