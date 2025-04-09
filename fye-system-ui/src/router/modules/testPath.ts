export default [
  {
    path: '/',
    redirect: '/index',
    name: 'Home',
    meta: {
      title: '首页',
      icon: 'ep:home-filled',
      noCache: false,
      affix: true
    }
  },
  {
    path: '/user',
    name: 'UserInfo',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'profile',
        name: 'Profile',
        meta: {
          canTo: true,
          hidden: true,
          noTagsView: false,
          icon: 'ep:user',
          title: 'common.profile'
        }
      },
      {
        path: 'notify-message',
        name: 'MyNotifyMessage',
        meta: {
          canTo: true,
          hidden: true,
          noTagsView: false,
          icon: 'ep:message',
          title: '我的站内信'
        }
      }
    ]
  },
  {
    path: '/dict',
    name: 'dict',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'type/data/:dictType',
        name: 'SystemDictData',
        meta: {
          title: '字典数据',
          noCache: true,
          hidden: true,
          canTo: true,
          icon: '',
          activeMenu: '/system/dict'
        }
      }
    ]
  },
  {
    path: '/codegen',
    name: 'CodegenEdit',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'edit',
        name: 'InfraCodegenEditTable',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          icon: 'ep:edit',
          title: '修改生成配置',
          activeMenu: 'infra/codegen/index'
        }
      }
    ]
  },
  {
    path: '/job',
    name: 'JobL',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'job-log',
        name: 'InfraJobLog',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          icon: 'ep:edit',
          title: '调度日志',
          activeMenu: 'infra/job/index'
        }
      }
    ]
  },
  {
    path: '/login',
    name: 'Login',
    meta: {
      hidden: true,
      title: 'router.login',
      noTagsView: true
    }
  },
  {
    path: '/sso',
    name: 'SSOLogin',
    meta: {
      hidden: true,
      title: 'router.login',
      noTagsView: true
    }
  },
  {
    path: '/social-login',
    name: 'SocialLogin',
    meta: {
      hidden: true,
      title: 'router.socialLogin',
      noTagsView: true
    }
  },
  {
    path: '/403',
    name: 'NoAccess',
    meta: {
      hidden: true,
      title: '403',
      noTagsView: true
    }
  },
  {
    path: '/404',
    name: 'NoFound',
    meta: {
      hidden: true,
      title: '404',
      noTagsView: true
    }
  },
  {
    path: '/500',
    name: 'Error',
    meta: {
      hidden: true,
      title: '500',
      noTagsView: true
    }
  },
  {
    path: '/bpm',
    name: 'bpm',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'manager/form/edit',
        name: 'BpmFormEditor',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '设计流程表单',
          activeMenu: '/bpm/manager/form'
        }
      },
      {
        path: 'manager/model/edit',
        name: 'BpmModelEditor',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '设计流程',
          activeMenu: '/bpm/manager/model'
        }
      },
      {
        path: 'manager/simple/model',
        name: 'SimpleModelDesign',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '仿钉钉设计流程',
          activeMenu: '/bpm/manager/model'
        }
      },
      {
        path: 'manager/definition',
        name: 'BpmProcessDefinition',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '流程定义',
          activeMenu: '/bpm/manager/model'
        }
      },
      {
        path: 'process-instance/detail',
        name: 'BpmProcessInstanceDetail',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '流程详情',
          activeMenu: '/bpm/task/my'
        }
      },
      {
        path: 'process-instance/report',
        name: 'BpmProcessInstanceReport',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '数据报表',
          activeMenu: '/bpm/manager/model'
        }
      },
      {
        path: 'oa/leave/create',
        name: 'OALeaveCreate',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '发起 OA 请假',
          activeMenu: '/bpm/oa/leave'
        }
      },
      {
        path: 'oa/leave/detail',
        name: 'OALeaveDetail',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '查看 OA 请假',
          activeMenu: '/bpm/oa/leave'
        }
      },
      {
        path: 'manager/model/create',
        name: 'BpmModelCreate',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '创建流程',
          activeMenu: '/bpm/manager/model'
        }
      },
      {
        path: 'manager/model/:type/:id',
        name: 'BpmModelUpdate',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          title: '修改流程',
          activeMenu: '/bpm/manager/model'
        }
      }
    ]
  },
  {
    path: '/mall/product',
    name: 'ProductCenter',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'spu/add',
        name: 'ProductSpuAdd',
        meta: {
          noCache: false,
          hidden: true,
          canTo: true,
          icon: 'ep:edit',
          title: '商品添加',
          activeMenu: '/mall/product/spu'
        }
      },
      {
        path: 'spu/edit/:id(\\d+)',
        name: 'ProductSpuEdit',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          icon: 'ep:edit',
          title: '商品编辑',
          activeMenu: '/mall/product/spu'
        }
      },
      {
        path: 'spu/detail/:id(\\d+)',
        name: 'ProductSpuDetail',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          icon: 'ep:view',
          title: '商品详情',
          activeMenu: '/mall/product/spu'
        }
      },
      {
        path: 'property/value/:propertyId(\\d+)',
        name: 'ProductPropertyValue',
        meta: {
          noCache: true,
          hidden: true,
          canTo: true,
          icon: 'ep:view',
          title: '商品属性值',
          activeMenu: '/product/property'
        }
      }
    ]
  },
  {
    path: '/mall/trade',
    name: 'TradeCenter',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'order/detail/:id(\\d+)',
        name: 'TradeOrderDetail',
        meta: {
          title: '订单详情',
          icon: 'ep:view',
          activeMenu: '/mall/trade/order'
        }
      },
      {
        path: 'after-sale/detail/:id(\\d+)',
        name: 'TradeAfterSaleDetail',
        meta: {
          title: '退款详情',
          icon: 'ep:view',
          activeMenu: '/mall/trade/after-sale'
        }
      }
    ]
  },
  {
    path: '/member',
    name: 'MemberCenter',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'user/detail/:id',
        name: 'MemberUserDetail',
        meta: {
          title: '会员详情',
          noCache: true,
          hidden: true
        }
      }
    ]
  },
  {
    path: '/pay',
    name: 'pay',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'cashier',
        name: 'PayCashier',
        meta: {
          title: '收银台',
          noCache: true,
          hidden: true
        }
      }
    ]
  },
  {
    path: '/diy',
    name: 'DiyCenter',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'template/decorate/:id',
        name: 'DiyTemplateDecorate',
        meta: {
          title: '模板装修',
          noCache: true,
          hidden: true,
          activeMenu: '/mall/promotion/diy/template'
        }
      },
      {
        path: 'page/decorate/:id',
        name: 'DiyPageDecorate',
        meta: {
          title: '页面装修',
          noCache: true,
          hidden: true,
          activeMenu: '/mall/promotion/diy/page'
        }
      }
    ]
  },
  {
    path: '/crm',
    name: 'CrmCenter',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'clue/detail/:id',
        name: 'CrmClueDetail',
        meta: {
          title: '线索详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/clue'
        }
      },
      {
        path: 'customer/detail/:id',
        name: 'CrmCustomerDetail',
        meta: {
          title: '客户详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/customer'
        }
      },
      {
        path: 'business/detail/:id',
        name: 'CrmBusinessDetail',
        meta: {
          title: '商机详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/business'
        }
      },
      {
        path: 'contract/detail/:id',
        name: 'CrmContractDetail',
        meta: {
          title: '合同详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/contract'
        }
      },
      {
        path: 'receivable-plan/detail/:id',
        name: 'CrmReceivablePlanDetail',
        meta: {
          title: '回款计划详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/receivable-plan'
        }
      },
      {
        path: 'receivable/detail/:id',
        name: 'CrmReceivableDetail',
        meta: {
          title: '回款详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/receivable'
        }
      },
      {
        path: 'contact/detail/:id',
        name: 'CrmContactDetail',
        meta: {
          title: '联系人详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/contact'
        }
      },
      {
        path: 'product/detail/:id',
        name: 'CrmProductDetail',
        meta: {
          title: '产品详情',
          noCache: true,
          hidden: true,
          activeMenu: '/crm/product'
        }
      }
    ]
  },
  {
    path: '/ai',
    name: 'Ai',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'image/square',
        name: 'AiImageSquare',
        meta: {
          title: '绘图作品',
          icon: 'ep:home-filled',
          noCache: false
        }
      }
    ]
  },
  {
    path: '/:pathMatch(.*)*',
    name: '',
    meta: {
      title: '404',
      hidden: true,
      breadcrumb: false
    }
  },
  {
    path: '/iot',
    name: 'IOT',
    meta: {
      hidden: true
    },
    children: [
      {
        path: 'product/detail/:id',
        name: 'IoTProductDetail',
        meta: {
          title: '产品详情',
          noCache: true,
          hidden: true,
          activeMenu: '/iot/product'
        }
      },
      {
        path: 'device/detail/:id',
        name: 'IoTDeviceDetail',
        meta: {
          title: '设备详情',
          noCache: true,
          hidden: true,
          activeMenu: '/iot/device'
        }
      }
    ]
  },

  {
    path: '/external-link',
    meta: {
      title: '外站信息',
      icon: 'tabler:external-link'
    },
    children: [
      {
        path: 'https://doc.iocoder.cn/',
        name: 'Https://doc.iocoder.cn/',
        meta: {
          title: 'Boot 开发文档',
          icon: 'ep:document',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'https://cloud.iocoder.cn',
        name: 'Https://cloud.iocoder.cn',
        meta: {
          title: 'Cloud 开发文档',
          icon: 'ep:document-copy',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'https://www.iocoder.cn',
        name: 'Https://www.iocoder.cn',
        meta: {
          title: '作者动态',
          icon: 'ep:avatar',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      }
    ]
  },
  {
    path: '/system',
    name: '/system',
    meta: {
      title: '系统管理',
      icon: 'ep:tools',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'tenant',
        name: 'Tenant',
        meta: {
          title: '租户管理',
          icon: 'fa-solid:house-user',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'list',
            name: 'SystemTenant',
            meta: {
              title: '租户列表',
              icon: 'ep:house',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'package',
            name: 'SystemTenantPackage',
            meta: {
              title: '租户套餐',
              icon: 'fa:bars',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'user',
        name: 'SystemUser',
        meta: {
          title: '用户管理',
          icon: 'ep:avatar',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'role',
        name: 'SystemRole',
        meta: {
          title: '角色管理',
          icon: 'ep:user',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'menu',
        name: 'SystemMenu',
        meta: {
          title: '菜单管理',
          icon: 'ep:menu',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'dept',
        name: 'SystemDept',
        meta: {
          title: '部门管理',
          icon: 'fa:address-card',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'post',
        name: 'SystemPost',
        meta: {
          title: '岗位管理',
          icon: 'fa:address-book-o',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'dict',
        name: 'SystemDictType',
        meta: {
          title: '字典管理',
          icon: 'ep:collection',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'messages',
        name: 'Messages',
        meta: {
          title: '消息中心',
          icon: 'ep:chat-dot-round',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'sms',
            name: 'Sms',
            meta: {
              title: '短信管理',
              icon: 'ep:message',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'sms-channel',
                name: 'SystemSmsChannel',
                meta: {
                  title: '短信渠道',
                  icon: 'fa:stack-exchange',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'sms-template',
                name: 'SystemSmsTemplate',
                meta: {
                  title: '短信模板',
                  icon: 'ep:connection',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'sms-log',
                name: 'SystemSmsLog',
                meta: {
                  title: '短信日志',
                  icon: 'fa:edit',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'mail',
            name: 'Mail',
            meta: {
              title: '邮箱管理',
              icon: 'fa-solid:mail-bulk',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'mail-account',
                name: 'SystemMailAccount',
                meta: {
                  title: '邮箱账号',
                  icon: 'fa:universal-access',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'mail-template',
                name: 'SystemMailTemplate',
                meta: {
                  title: '邮件模版',
                  icon: 'fa:tag',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'mail-log',
                name: 'SystemMailLog',
                meta: {
                  title: '邮件记录',
                  icon: 'fa:edit',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'notify',
            name: 'Notify',
            meta: {
              title: '站内信管理',
              icon: 'ep:message-box',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'notify-template',
                name: 'SystemNotifyTemplate',
                meta: {
                  title: '模板管理',
                  icon: 'fa:archive',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'notify-message',
                name: 'SystemNotifyMessage',
                meta: {
                  title: '消息记录',
                  icon: 'fa:edit',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'notice',
            name: 'SystemNotice',
            meta: {
              title: '通知公告',
              icon: 'ep:takeaway-box',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'log',
        name: 'Log',
        meta: {
          title: '审计日志',
          icon: 'ep:document-copy',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'operate-log',
            name: 'SystemOperateLog',
            meta: {
              title: '操作日志',
              icon: 'ep:position',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'login-log',
            name: 'SystemLoginLog',
            meta: {
              title: '登录日志',
              icon: 'ep:promotion',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'oauth2',
        name: 'Oauth2',
        meta: {
          title: 'OAuth 2.0',
          icon: 'fa:dashcube',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'oauth2/application',
            name: 'SystemOAuth2Client',
            meta: {
              title: '应用管理',
              icon: 'fa:hdd-o',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'token',
            name: 'SystemTokenClient',
            meta: {
              title: '令牌管理',
              icon: 'fa:key',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'social',
        name: 'Social',
        meta: {
          title: '三方登录',
          icon: 'fa:rocket',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'client',
            name: 'SocialClient',
            meta: {
              title: '三方应用',
              icon: 'ep:set-up',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'user',
            name: 'SocialUser',
            meta: {
              title: '三方用户',
              icon: 'ep:avatar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'area',
        name: 'SystemArea',
        meta: {
          title: '地区管理',
          icon: 'fa:map-marker',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      }
    ]
  },
  {
    path: '/infra',
    name: '/infra',
    meta: {
      title: '基础设施',
      icon: 'ep:monitor',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'codegen',
        name: 'InfraCodegen',
        meta: {
          title: '代码生成',
          icon: 'ep:document-copy',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'demo',
        name: 'Demo',
        meta: {
          title: '代码生成案例',
          icon: 'ep:aim',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'demo01-contact',
            name: 'Demo01Contact',
            meta: {
              title: '单表（增删改查）',
              icon: 'ep:bicycle',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'demo02-category',
            name: 'Demo02Category',
            meta: {
              title: '树表（增删改查）',
              icon: 'fa:tree',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'demo03-normal',
            name: 'Demo03StudentNormal',
            meta: {
              title: '主子表（标准）',
              icon: 'fa:battery-3',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'demo03-erp',
            name: 'Demo03StudentERP',
            meta: {
              title: '主子表（ERP）',
              icon: 'ep:calendar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'demo03-inner',
            name: 'Demo03StudentInner',
            meta: {
              title: '主子表（内嵌）',
              icon: 'fa:power-off',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'data-source-config',
        name: 'InfraDataSourceConfig',
        meta: {
          title: '数据源配置',
          icon: 'ep:data-analysis',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'build',
        name: 'InfraBuild',
        meta: {
          title: '表单构建',
          icon: 'fa:wpforms',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'swagger',
        name: 'InfraSwagger',
        meta: {
          title: 'API 接口',
          icon: 'fa:fighter-jet',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'log',
        name: 'Log',
        meta: {
          title: 'API 日志',
          icon: 'fa:tasks',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'api-access-log',
            name: 'InfraApiAccessLog',
            meta: {
              title: '访问日志',
              icon: 'ep:place',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'api-error-log',
            name: 'InfraApiErrorLog',
            meta: {
              title: '错误日志',
              icon: 'ep:warning-filled',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'websocket',
        name: 'InfraWebSocket',
        meta: {
          title: 'WebSocket',
          icon: 'ep:connection',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'file',
        name: 'File',
        meta: {
          title: '文件管理',
          icon: 'ep:files',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'file-config',
            name: 'InfraFileConfig',
            meta: {
              title: '文件配置',
              icon: 'fa-solid:file-signature',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'file',
            name: 'InfraFile',
            meta: {
              title: '文件列表',
              icon: 'ep:upload-filled',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'job',
        name: 'InfraJob',
        meta: {
          title: '定时任务',
          icon: 'fa-solid:tasks',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'config',
        name: 'InfraConfig',
        meta: {
          title: '配置管理',
          icon: 'fa:connectdevelop',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'monitors',
        name: 'Monitors',
        meta: {
          title: '监控中心',
          icon: 'ep:monitor',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'druid',
            name: 'InfraDruid',
            meta: {
              title: 'MySQL 监控',
              icon: 'fa-solid:box',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'redis',
            name: 'InfraRedis',
            meta: {
              title: 'Redis 监控',
              icon: 'fa:reddit-square',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'admin-server',
            name: 'InfraAdminServer',
            meta: {
              title: 'Java 监控',
              icon: 'ep:coffee-cup',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'skywalking',
            name: 'InfraSkyWalking',
            meta: {
              title: '链路追踪',
              icon: 'fa:eye',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/pay',
    name: '/pay',
    meta: {
      title: '支付管理',
      icon: 'ep:money',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'app',
        name: 'PayApp',
        meta: {
          title: '应用信息',
          icon: 'fa:apple',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'order',
        name: 'PayOrder',
        meta: {
          title: '支付订单',
          icon: 'fa:cc-paypal',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'refund',
        name: 'PayRefund',
        meta: {
          title: '退款订单',
          icon: 'fa:registered',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'transfer',
        name: 'PayTransfer',
        meta: {
          title: '转账订单',
          icon: 'ep:credit-card',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'wallet',
        name: 'Wallet',
        meta: {
          title: '钱包管理',
          icon: 'ep:wallet',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'wallet-balance',
            name: 'WalletBalance',
            meta: {
              title: '钱包余额',
              icon: 'fa:leaf',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'wallet-recharge-package',
            name: 'WalletRechargePackage',
            meta: {
              title: '充值套餐',
              icon: 'fa:leaf',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'notify',
        name: 'PayNotify',
        meta: {
          title: '回调通知',
          icon: 'ep:mute-notification',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'demo',
        name: 'Demo',
        meta: {
          title: '接入示例',
          icon: 'fa-solid:dragon',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'order',
            name: 'Order',
            meta: {
              title: '支付&退款案例',
              icon: 'fa:paypal',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'transfer',
            name: 'Transfer',
            meta: {
              title: '转账案例',
              icon: 'fa:transgender-alt',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/report',
    name: '/report',
    meta: {
      title: '报表管理',
      icon: 'ep:pie-chart',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'jimu-report',
        name: 'GoView',
        meta: {
          title: '报表设计器',
          icon: 'ep:trend-charts',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'go-view',
        name: 'JimuReport',
        meta: {
          title: '大屏设计器',
          icon: 'fa:area-chart',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      }
    ]
  },
  {
    path: '/bpm',
    name: '/bpm',
    meta: {
      title: '工作流程',
      icon: 'fa:medium',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'manager',
        name: 'Manager',
        meta: {
          title: '流程管理',
          icon: 'fa:dedent',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'model',
            name: 'BpmModel',
            meta: {
              title: '流程模型',
              icon: 'fa-solid:project-diagram',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'form',
            name: 'BpmForm',
            meta: {
              title: '流程表单',
              icon: 'fa:hdd-o',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'category',
            name: 'BpmCategory',
            meta: {
              title: '流程分类',
              icon: 'fa:object-ungroup',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'user-group',
            name: 'BpmUserGroup',
            meta: {
              title: '用户分组',
              icon: 'fa:user-secret',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'process-listener',
            name: 'BpmProcessListener',
            meta: {
              title: '流程监听器',
              icon: 'fa:assistive-listening-systems',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'process-expression',
            name: 'BpmProcessExpression',
            meta: {
              title: '流程表达式',
              icon: 'fa:wpexplorer',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'process-instance/manager',
            name: 'BpmProcessInstanceManager',
            meta: {
              title: '流程实例',
              icon: 'fa:square',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'process-tasnk',
            name: 'BpmManagerTask',
            meta: {
              title: '流程任务',
              icon: 'ep:collection-tag',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'task',
        name: 'Task',
        meta: {
          title: '审批中心',
          icon: 'fa:tasks',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'create',
            name: 'BpmProcessInstanceCreate',
            meta: {
              title: '发起流程',
              icon: 'fa-solid:grin-stars',
              hidden: false,
              noCache: true,
              alwaysShow: null
            }
          },
          {
            path: 'my',
            name: 'BpmProcessInstanceMy',
            meta: {
              title: '我的流程',
              icon: 'fa-solid:book',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'todo',
            name: 'BpmTodoTask',
            meta: {
              title: '待办任务',
              icon: 'fa:slack',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'done',
            name: 'BpmDoneTask',
            meta: {
              title: '已办任务',
              icon: 'fa:delicious',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'copy',
            name: 'BpmProcessInstanceCopy',
            meta: {
              title: '抄送我的',
              icon: 'ep:copy-document',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'oa',
        name: 'Oa',
        meta: {
          title: 'OA 示例',
          icon: 'fa:road',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'leave',
            name: 'BpmOALeave',
            meta: {
              title: '请假查询',
              icon: 'fa:leanpub',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/member',
    name: '/member',
    meta: {
      title: '会员中心',
      icon: 'ep:bicycle',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'config',
        name: 'MemberConfig',
        meta: {
          title: '会员配置',
          icon: 'fa:archive',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'user',
        name: 'MemberUser',
        meta: {
          title: '会员管理',
          icon: 'ep:avatar',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'tag',
        name: 'MemberTag',
        meta: {
          title: '会员标签',
          icon: 'ep:collection-tag',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'level',
        name: 'MemberLevel',
        meta: {
          title: '会员等级',
          icon: 'fa:level-up',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'group',
        name: 'MemberGroup',
        meta: {
          title: '会员分组',
          icon: 'fa:group',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'record',
        name: 'PointRecord',
        meta: {
          title: '会员积分',
          icon: 'fa:asterisk',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'signin',
        name: 'Signin',
        meta: {
          title: '会员签到',
          icon: 'ep:alarm-clock',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'config',
            name: 'SignInConfig',
            meta: {
              title: '签到配置',
              icon: 'ep:calendar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'record',
            name: 'SignInRecord',
            meta: {
              title: '签到记录',
              icon: 'ep:chicken',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/mall',
    name: '/mall',
    meta: {
      title: '商城系统',
      icon: 'ep:shop',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'home',
        name: 'MallHome',
        meta: {
          title: '商城首页',
          icon: 'ep:home-filled',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'product',
        name: 'Product',
        meta: {
          title: '商品中心',
          icon: 'fa:product-hunt',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'spu',
            name: 'ProductSpu',
            meta: {
              title: '商品列表',
              icon: 'ep:apple',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'category',
            name: 'ProductCategory',
            meta: {
              title: '商品分类',
              icon: 'ep:cellphone',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'brand',
            name: 'ProductBrand',
            meta: {
              title: '商品品牌',
              icon: 'ep:chicken',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'property',
            name: 'ProductProperty',
            meta: {
              title: '商品属性',
              icon: 'ep:cold-drink',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'comment',
            name: 'ProductComment',
            meta: {
              title: '商品评论',
              icon: 'ep:comment',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'trade',
        name: 'Trade',
        meta: {
          title: '订单中心',
          icon: 'ep:eleme',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'config',
            name: 'TradeConfig',
            meta: {
              title: '交易配置',
              icon: 'ep:setting',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'order',
            name: 'TradeOrder',
            meta: {
              title: '订单列表',
              icon: 'ep:list',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'after-sale',
            name: 'TradeAfterSale',
            meta: {
              title: '售后退款',
              icon: 'ep:refrigerator',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'delivery',
            name: 'Delivery',
            meta: {
              title: '配送管理',
              icon: 'ep:shopping-cart',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'express',
                name: 'Express',
                meta: {
                  title: '快递发货',
                  icon: 'ep:bicycle',
                  hidden: false,
                  noCache: false,
                  alwaysShow: true
                },
                children: [
                  {
                    path: 'express',
                    name: 'Express',
                    meta: {
                      title: '快递公司',
                      icon: 'ep:compass',
                      hidden: false,
                      noCache: false,
                      alwaysShow: null
                    }
                  },
                  {
                    path: 'express-template',
                    name: 'ExpressTemplate',
                    meta: {
                      title: '运费模版',
                      icon: 'ep:coordinate',
                      hidden: false,
                      noCache: false,
                      alwaysShow: null
                    }
                  }
                ]
              },
              {
                path: 'pick-up-store',
                name: 'PickUpStore',
                meta: {
                  title: '门店自提',
                  icon: 'ep:add-location',
                  hidden: false,
                  noCache: false,
                  alwaysShow: true
                },
                children: [
                  {
                    path: 'pick-up-store',
                    name: 'PickUpStore',
                    meta: {
                      title: '门店管理',
                      icon: 'ep:basketball',
                      hidden: false,
                      noCache: false,
                      alwaysShow: null
                    }
                  },
                  {
                    path: 'pick-up-order',
                    name: 'PickUpOrder',
                    meta: {
                      title: '核销订单',
                      icon: 'ep:list',
                      hidden: false,
                      noCache: false,
                      alwaysShow: null
                    }
                  }
                ]
              }
            ]
          },
          {
            path: 'brokerage',
            name: 'Brokerage',
            meta: {
              title: '分销管理',
              icon: 'fa-solid:project-diagram',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'brokerage-user',
                name: 'TradeBrokerageUser',
                meta: {
                  title: '分销用户',
                  icon: 'fa-solid:user-tie',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'brokerage-record',
                name: 'TradeBrokerageRecord',
                meta: {
                  title: '佣金记录',
                  icon: 'fa:money',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'brokerage-withdraw',
                name: 'TradeBrokerageWithdraw',
                meta: {
                  title: '佣金提现',
                  icon: 'fa:credit-card',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          }
        ]
      },
      {
        path: 'promotion',
        name: 'Promotion',
        meta: {
          title: '营销中心',
          icon: 'ep:present',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'content',
            name: 'Content',
            meta: {
              title: '内容管理',
              icon: 'ep:collection',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'article/category',
                name: 'ArticleCategory',
                meta: {
                  title: '文章分类',
                  icon: 'fa:certificate',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'article',
                name: 'Article',
                meta: {
                  title: '文章列表',
                  icon: 'ep:connection',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'banner',
                name: 'Banner',
                meta: {
                  title: 'Banner',
                  icon: 'fa:bandcamp',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'coupon',
            name: 'Coupon',
            meta: {
              title: '优惠劵',
              icon: 'fa-solid:disease',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'template',
                name: 'PromotionCouponTemplate',
                meta: {
                  title: '优惠劵列表',
                  icon: 'ep:discount',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'list',
                name: 'PromotionCoupon',
                meta: {
                  title: '领取记录',
                  icon: 'ep:collection-tag',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'seckill',
            name: 'Seckill',
            meta: {
              title: '秒杀活动',
              icon: 'ep:place',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'config',
                name: 'PromotionSeckillConfig',
                meta: {
                  title: '秒杀时段',
                  icon: 'ep:baseball',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'activity',
                name: 'PromotionSeckillActivity',
                meta: {
                  title: '秒杀商品',
                  icon: 'ep:basketball',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'combination',
            name: 'Combination',
            meta: {
              title: '拼团活动',
              icon: 'fa:group',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'acitivity',
                name: 'PromotionCombinationActivity',
                meta: {
                  title: '拼团商品',
                  icon: 'ep:apple',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'record',
                name: 'PromotionCombinationRecord',
                meta: {
                  title: '拼团记录',
                  icon: 'ep:avatar',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'bargain',
            name: 'Bargain',
            meta: {
              title: '砍价活动',
              icon: 'ep:box',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'activity',
                name: 'PromotionBargainActivity',
                meta: {
                  title: '砍价商品',
                  icon: 'ep:burger',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'record',
                name: 'PromotionBargainRecord',
                meta: {
                  title: '砍价记录',
                  icon: 'ep:list',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'point-activity',
            name: 'PointActivity',
            meta: {
              title: '积分商城',
              icon: 'ep:bowl',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'diy-template',
            name: 'DiyTemplate',
            meta: {
              title: '商城装修',
              icon: 'fa6-solid:brush',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'diy-template',
                name: 'DiyTemplate',
                meta: {
                  title: '装修模板',
                  icon: 'fa6-solid:brush',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'diy-page',
                name: 'DiyPage',
                meta: {
                  title: '装修页面',
                  icon: 'foundation:page-edit',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          },
          {
            path: 'youhui',
            name: 'Youhui',
            meta: {
              title: '优惠活动',
              icon: 'ep:aim',
              hidden: false,
              noCache: false,
              alwaysShow: true
            },
            children: [
              {
                path: 'discount-activity',
                name: 'PromotionDiscountActivity',
                meta: {
                  title: '限时折扣',
                  icon: 'ep:timer',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              },
              {
                path: 'reward-activity',
                name: 'PromotionRewardActivity',
                meta: {
                  title: '满减送',
                  icon: 'ep:goblet-square-full',
                  hidden: false,
                  noCache: false,
                  alwaysShow: null
                }
              }
            ]
          }
        ]
      },
      {
        path: 'statistics',
        name: 'Statistics',
        meta: {
          title: '统计中心',
          icon: 'ep:data-line',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'member',
            name: 'MemberStatistics',
            meta: {
              title: '会员统计',
              icon: 'ep:avatar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'product',
            name: 'ProductStatistics',
            meta: {
              title: '商品统计',
              icon: 'fa:product-hunt',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'trade',
            name: 'TradeStatistics',
            meta: {
              title: '交易统计',
              icon: 'fa-solid:credit-card',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'kefu',
        name: 'KeFu',
        meta: {
          title: '客服中心',
          icon: 'fa-solid:user-alt',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      }
    ]
  },
  {
    path: '/mp',
    name: '/mp',
    meta: {
      title: '公众号管理',
      icon: 'ep:compass',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'account',
        name: 'MpAccount',
        meta: {
          title: '账号管理',
          icon: 'fa:user',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'statistics',
        name: 'MpStatistics',
        meta: {
          title: '数据统计',
          icon: 'ep:trend-charts',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'tag',
        name: 'MpTag',
        meta: {
          title: '标签管理',
          icon: 'ep:collection-tag',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'user',
        name: 'MpUser',
        meta: {
          title: '粉丝管理',
          icon: 'fa:user-secret',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'message',
        name: 'MpMessage',
        meta: {
          title: '消息管理',
          icon: 'ep:message',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'menu',
        name: 'MpMenu',
        meta: {
          title: '菜单管理',
          icon: 'ep:menu',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'auto-reply',
        name: 'MpAutoReply',
        meta: {
          title: '自动回复',
          icon: 'fa-solid:republican',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'material',
        name: 'MpMaterial',
        meta: {
          title: '素材管理',
          icon: 'ep:basketball',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'draft',
        name: 'MpDraft',
        meta: {
          title: '图文草稿箱',
          icon: 'ep:edit',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'free-publish',
        name: 'MpFreePublish',
        meta: {
          title: '图文发表记录',
          icon: 'ep:edit-pen',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      }
    ]
  },
  {
    path: '/crm',
    name: '/crm',
    meta: {
      title: 'CRM 系统',
      icon: 'ep:avatar',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'backlog',
        name: 'CrmBacklog',
        meta: {
          title: '待办事项',
          icon: 'fa-solid:tasks',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'clue',
        name: 'CrmClue',
        meta: {
          title: '线索管理',
          icon: 'fa:pagelines',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'customer',
        name: 'CrmCustomer',
        meta: {
          title: '客户管理',
          icon: 'fa:address-book-o',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'contact',
        name: 'CrmContact',
        meta: {
          title: '联系人管理',
          icon: 'fa:address-book-o',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'customer/pool',
        name: 'CrmCustomerPool',
        meta: {
          title: '客户公海',
          icon: 'fa-solid:swimming-pool',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'business',
        name: 'CrmBusiness',
        meta: {
          title: '商机管理',
          icon: 'fa:bus',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'contract',
        name: 'CrmContract',
        meta: {
          title: '合同管理',
          icon: 'ep:notebook',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'receivable',
        name: 'CrmReceivable',
        meta: {
          title: '回款管理',
          icon: 'ep:money',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'receivable-plan',
        name: 'CrmReceivablePlan',
        meta: {
          title: '回款计划',
          icon: 'fa:money',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'product',
        name: 'CrmProduct',
        meta: {
          title: '产品管理',
          icon: 'fa:product-hunt',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'statistics',
        name: 'Statistics',
        meta: {
          title: '数据统计',
          icon: 'ep:data-line',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'customer',
            name: 'CrmStatisticsCustomer',
            meta: {
              title: '客户分析',
              icon: 'ep:avatar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'ranking',
            name: 'CrmStatisticsRank',
            meta: {
              title: '排行榜',
              icon: 'fa:area-chart',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'performance',
            name: 'CrmStatisticsPerformance',
            meta: {
              title: '员工业绩',
              icon: 'ep:dish-dot',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'portrait',
            name: 'CrmStatisticsPortrait',
            meta: {
              title: '客户画像',
              icon: 'ep:picture',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'funnel',
            name: 'CrmStatisticsFunnel',
            meta: {
              title: '销售漏斗',
              icon: 'ep:grape',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'config',
        name: 'Config',
        meta: {
          title: '系统配置',
          icon: 'ep:connection',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'customer-pool-config',
            name: 'CrmCustomerPoolConfig',
            meta: {
              title: '客户公海配置',
              icon: 'ep:data-analysis',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'customer-limit-config',
            name: 'CrmCustomerLimitConfig',
            meta: {
              title: '客户限制配置',
              icon: 'ep:avatar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'product/category',
            name: 'CrmProductCategory',
            meta: {
              title: '产品分类配置',
              icon: 'fa-solid:window-restore',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'business-status',
            name: 'CrmBusinessStatus',
            meta: {
              title: '商机状态配置',
              icon: 'fa-solid:charging-station',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'contract-config',
            name: 'CrmContractConfig',
            meta: {
              title: '合同配置',
              icon: 'ep:connection',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/erp',
    name: '/erp',
    meta: {
      title: 'ERP 系统',
      icon: 'fa-solid:store',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'home',
        name: 'ErpHome',
        meta: {
          title: 'ERP 首页',
          icon: 'ep:home-filled',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'purchase',
        name: 'Purchase',
        meta: {
          title: '采购管理',
          icon: 'fa:buysellads',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'order',
            name: 'ErpPurchaseOrder',
            meta: {
              title: '采购订单',
              icon: 'fa-solid:border-all',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'in',
            name: 'ErpPurchaseIn',
            meta: {
              title: '采购入库',
              icon: 'fa-solid:gopuram',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'return',
            name: 'ErpPurchaseReturn',
            meta: {
              title: '采购退货',
              icon: 'ep:minus',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'supplier',
            name: 'ErpSupplier',
            meta: {
              title: '供应商信息',
              icon: 'fa:superpowers',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'sale',
        name: 'Sale',
        meta: {
          title: '销售管理',
          icon: 'fa:sellsy',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'order',
            name: 'ErpSaleOrder',
            meta: {
              title: '销售订单',
              icon: 'fa:first-order',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'out',
            name: 'ErpSaleOut',
            meta: {
              title: '销售出库',
              icon: 'ep:sold-out',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'return',
            name: 'ErpSaleReturn',
            meta: {
              title: '销售退货',
              icon: 'fa-solid:bone',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'customer',
            name: 'ErpCustomer',
            meta: {
              title: '客户信息',
              icon: 'ep:avatar',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'stock',
        name: 'Stock',
        meta: {
          title: '库存管理',
          icon: 'fa:window-restore',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'warehouse',
            name: 'ErpWarehouse',
            meta: {
              title: '仓库信息',
              icon: 'ep:house',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'stock',
            name: 'ErpStock',
            meta: {
              title: '产品库存',
              icon: 'ep:coffee',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'record',
            name: 'ErpStockRecord',
            meta: {
              title: '出入库明细',
              icon: 'fa-solid:blog',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'in',
            name: 'ErpStockIn',
            meta: {
              title: '其它入库',
              icon: 'ep:zoom-in',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'out',
            name: 'ErpStockOut',
            meta: {
              title: '其它出库',
              icon: 'ep:zoom-out',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'move',
            name: 'ErpStockMove',
            meta: {
              title: '库存调拨',
              icon: 'ep:folder-remove',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'check',
            name: 'ErpStockCheck',
            meta: {
              title: '库存盘点',
              icon: 'ep:circle-check-filled',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'product',
        name: 'Product',
        meta: {
          title: '产品管理',
          icon: 'fa:product-hunt',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'product',
            name: 'ErpProduct',
            meta: {
              title: '产品信息',
              icon: 'fa-solid:apple-alt',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'product-category',
            name: 'ErpProductCategory',
            meta: {
              title: '产品分类',
              icon: 'fa:certificate',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'unit',
            name: 'ErpProductUnit',
            meta: {
              title: '产品单位',
              icon: 'ep:opportunity',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      },
      {
        path: 'finance',
        name: 'Finance',
        meta: {
          title: '财务管理',
          icon: 'ep:money',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'payment',
            name: 'ErpFinancePayment',
            meta: {
              title: '付款单',
              icon: 'ep:caret-right',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'receipt',
            name: 'ErpFinanceReceipt',
            meta: {
              title: '收款单',
              icon: 'ep:expand',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'account',
            name: 'ErpAccount',
            meta: {
              title: '结算账户',
              icon: 'fa:universal-access',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/ai',
    name: '/ai',
    meta: {
      title: 'AI 大模型',
      icon: 'fa:apple',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'chat',
        name: 'AiChat',
        meta: {
          title: 'AI 对话',
          icon: 'ep:message',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'image',
        name: 'AiImage',
        meta: {
          title: 'AI 绘画',
          icon: 'ep:picture-rounded',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'write',
        name: 'AiWrite',
        meta: {
          title: 'AI 写作',
          icon: 'fa-solid:book-reader',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'music',
        name: 'AiMusic',
        meta: {
          title: 'AI 音乐',
          icon: 'fa:music',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'mind-map',
        name: 'AiMindMap',
        meta: {
          title: 'AI 思维导图',
          icon: 'fa:sitemap',
          hidden: false,
          noCache: false,
          alwaysShow: null
        }
      },
      {
        path: 'console',
        name: 'Console',
        meta: {
          title: '控制台',
          icon: 'ep:setting',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'api-key',
            name: 'AiApiKey',
            meta: {
              title: 'API 密钥',
              icon: 'ep:key',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'chat-model',
            name: 'AiChatModel',
            meta: {
              title: '聊天模型',
              icon: 'fa-solid:abacus',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'chat-role',
            name: 'AiChatRole',
            meta: {
              title: '聊天角色',
              icon: 'fa:user-secret',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'chat-conversation',
            name: 'AiChatManager',
            meta: {
              title: '聊天管理',
              icon: 'ep:chat-square',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'image',
            name: 'AiImageManager',
            meta: {
              title: '绘画管理',
              icon: 'fa:file-image-o',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'music',
            name: 'AiMusicManager',
            meta: {
              title: '音乐管理',
              icon: 'fa:music',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'write',
            name: 'AiWriteManager',
            meta: {
              title: '写作管理',
              icon: 'fa:bookmark-o',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'mind-map',
            name: 'AiMindMapManager',
            meta: {
              title: '导图管理',
              icon: 'fa:map',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  },
  {
    path: '/iot',
    name: '/iot',
    meta: {
      title: 'IOT 物联网',
      icon: 'fa-solid:hdd',
      hidden: false,
      noCache: false,
      alwaysShow: true
    },
    children: [
      {
        path: 'device',
        name: 'Device',
        meta: {
          title: '设备接入',
          icon: 'ep:platform',
          hidden: false,
          noCache: false,
          alwaysShow: true
        },
        children: [
          {
            path: 'product',
            name: 'IoTProduct',
            meta: {
              title: '产品管理',
              icon: '',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'device',
            name: 'IoTDevice',
            meta: {
              title: '设备管理',
              icon: '',
              hidden: false,
              noCache: false,
              alwaysShow: null
            }
          },
          {
            path: 'think-model-function',
            name: 'ThinkModelFunction',
            meta: {
              title: 'IoT 产品物模型管理',
              icon: '',
              hidden: true,
              noCache: false,
              alwaysShow: null
            }
          }
        ]
      }
    ]
  }
]
